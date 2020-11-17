package com.whiteglovelady.api;

import com.whiteglovelady.model.Inventory;
import com.whiteglovelady.model.InventoryItems;
import com.whiteglovelady.serves.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//This is a Java Bean
@RequestMapping("/api/inventory")//everything related to inventory
public class InventoryController
{
    private InventoryService inventoryService;

    @Autowired//Example of an Indep injection
    public InventoryController(InventoryService inventoryService)
    {
        this.inventoryService = inventoryService;
    }
  @GetMapping("/{id}")//Path to REST Call
   public InventoryItems dummy(@PathVariable String id)
 {
    return inventoryService.getItem(id);
  }
    @GetMapping
    public Inventory getAllItems()
    {
     return inventoryService.getAll();
    }

    @DeleteMapping("/{id}")
    public InventoryItems deleteItem(@PathVariable String id)
    {
        return inventoryService.getItem(id);


    }

    @PostMapping
    public InventoryItems addItem(@RequestBody InventoryItems items)
    {
        return inventoryService.addItem(items);
    }

    @PutMapping
    public  InventoryItems updateItem(@RequestBody InventoryItems items)
    {
        return inventoryService.updateItem(items);
    }

 }

