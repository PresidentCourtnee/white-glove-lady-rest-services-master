package com.whiteglovelady.serves;

import com.whiteglovelady.model.Inventory;
import com.whiteglovelady.model.InventoryItems;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InventoryService
{
    InventoryItems getItem(String id);
    Inventory getAll();
    InventoryItems addItem(InventoryItems item);
    int deleteItem(String id);
    InventoryItems updateItem(InventoryItems item);


}
