package com.example.store.item;

import com.example.store.company.Company;
import com.example.store.product_info.Product_Info;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item_name;
    private String last_updated;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;
    @JsonManagedReference
    @OneToOne
    private Product_Info productInfo;
    public Item() {
    }

    public Item(Long id, String item_name, String last_updated, Company company) {
        this.id = id;
        this.item_name = item_name;
        this.last_updated = last_updated;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
