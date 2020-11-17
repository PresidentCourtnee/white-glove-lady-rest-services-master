package com.whiteglovelady.model;

import java.util.List;
//wrapper for Inventory Items
public class Inventory
{
    private List<InventoryItems> items;

    public List<InventoryItems>getItems()
    {
        return items;
    }

    public void setItems (List<InventoryItems> items)
    {
        this.items = items;
    }
}
