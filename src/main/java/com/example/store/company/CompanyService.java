package com.example.store.company;

import com.example.store.item.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private  CompanyRepository companyRepository;
    public CompanyService(CompanyRepository companyRepository)
    {
        this.companyRepository=companyRepository;
    }
    public List<Company> getAllCompany()
    {
        return companyRepository.findAll();
    }

    public Company addCompany(Company company) {

         companyRepository.save(company);
         return company;
    }
}
