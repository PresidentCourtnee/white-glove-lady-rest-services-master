package com.whiteglovelady.model;

import java.util.List;

//wrapper for Customer Items
public class Customer
{
    private List<CustomerInfo> items;

    public List<CustomerInfo>getItems()
    {
        return items;
    }

    public void setItems (List<CustomerInfo> items)
    {
        this.items = items;
    }
}