package com.example.store.company;

import com.example.store.item.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/company")
@RestController
public class CompanyController {
    private final CompanyService companyService;
    public CompanyController(CompanyService companyService)
    {
        this.companyService=companyService;
    }
    @GetMapping
    public List<Company> getAllCompany()
    {
        return companyService.getAllCompany();
    }
    @PostMapping
    public void addCompany(@RequestBody Company company)
    {

         companyService.addCompany(company);
    }

}
