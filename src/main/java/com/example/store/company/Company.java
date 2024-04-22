package com.example.store.company;

import com.example.store.genre.Genre;
import com.example.store.item.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String company_name;
    @JsonManagedReference
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Item> items;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
    public Company() {
    }

    public Company(Long id, String company_name, List<Item> items, Genre genre) {
        this.id = id;
        this.company_name = company_name;
        this.items = items;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
