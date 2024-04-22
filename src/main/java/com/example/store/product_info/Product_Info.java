package com.example.store.product_info;

import com.example.store.item.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product_Info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long price;
    private Long quantity;
    private Long min_quantity;
    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "item")
    private Item item;
}
