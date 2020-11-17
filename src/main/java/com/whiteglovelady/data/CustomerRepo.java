package com.whiteglovelady.data;

import com.whiteglovelady.model.CustomerInfo;
import com.whiteglovelady.model.InventoryItems;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerInfo,String> {
}