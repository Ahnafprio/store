package com.example.store.item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository)
    {
        this.itemRepository=itemRepository;
    }
    public List<Item> getAllItem()
    {
        return itemRepository.findAll();
    }

    public void addItem(Item item) {
       // return item;
         itemRepository.save(item);
    }
}
