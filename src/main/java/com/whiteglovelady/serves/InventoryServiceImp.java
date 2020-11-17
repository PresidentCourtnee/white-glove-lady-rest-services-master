package com.whiteglovelady.serves;

import com.whiteglovelady.data.InventoryItemsRepo;
import com.whiteglovelady.model.Inventory;
import com.whiteglovelady.model.InventoryItems;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class InventoryServiceImp implements InventoryService
{

    InventoryItemsRepo inventoryItemsRepo;
    public InventoryServiceImp(InventoryItemsRepo inventoryItemsRepo)
    {
        this.inventoryItemsRepo = inventoryItemsRepo;
    }

    @Override
    public InventoryItems getItem(String id)
    {
        return inventoryItemsRepo.findById(id).get();
    }

    @Override
    public Inventory getAll() {
        Iterable<InventoryItems> items = inventoryItemsRepo.findAll();
        Inventory inventory = new Inventory();
        List<InventoryItems>itemsList = new ArrayList<>();
        for (InventoryItems item: items)
        {
            itemsList.add(item);
        }
        inventory.setItems(itemsList);
        return inventory;
    }

    @Override
    public InventoryItems addItem(InventoryItems item) {
        item.setId(UUID.randomUUID().toString());
        return inventoryItemsRepo.save(item);
    }

    @Override
    public int deleteItem(String id) {
        inventoryItemsRepo.deleteById(id);
        return 1;
    }

    @Override
    public InventoryItems updateItem(InventoryItems item) {
        return inventoryItemsRepo.save(item);
    }
}
