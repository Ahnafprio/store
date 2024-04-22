package com.example.store.item;

import com.example.store.genre.Genre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    ItemService itemService;
    public ItemController(ItemService itemService)
    {
        this.itemService=itemService;
    }
    @GetMapping
    public List<Item> getAllItem()
    {
        return itemService.getAllItem();
    }
    @PostMapping
    public void addItem(@RequestBody Item item)
    {
         //return item;
         itemService.addItem(item);
    }

}
