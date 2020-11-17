package com.whiteglovelady.serves;

import com.whiteglovelady.model.Customer;
import com.whiteglovelady.model.CustomerInfo;

public interface CustomerService {

    CustomerInfo getItem(String Custid);
    Customer getAll();
    CustomerInfo addItem(CustomerInfo item);
    int deleteItem(String Custid);
    CustomerInfo updateItem(CustomerInfo item);

}