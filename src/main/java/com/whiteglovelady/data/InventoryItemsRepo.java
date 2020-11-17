package com.whiteglovelady.data;

import com.whiteglovelady.model.InventoryItems;
import org.springframework.data.repository.CrudRepository;

public interface InventoryItemsRepo extends CrudRepository<InventoryItems,String>
{

}
