package com.whiteglovelady.serves;

import com.whiteglovelady.data.CustomerRepo;
import com.whiteglovelady.model.Customer;
import com.whiteglovelady.model.CustomerInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImp implements CustomerService
{

    CustomerRepo customerRepo;
    public CustomerServiceImp(CustomerRepo customerRepo)
    {
        this.customerRepo = customerRepo;
    }

    @Override
    public CustomerInfo getItem(String id)
    {
        return customerRepo.findById(id).get();
    }

    @Override
    public Customer getAll() {
        Iterable<CustomerInfo> items = customerRepo.findAll();
        Customer customer = new Customer();
        List<CustomerInfo>itemsList = new ArrayList<>();
        for (CustomerInfo item: items)
        {
            itemsList.add(item);
        }
        customer.setItems(itemsList);
        return customer;
    }

    @Override
    public CustomerInfo addItem(CustomerInfo item) {
        item.setId(UUID.randomUUID().toString());
        return customerRepo.save(item);
    }

    @Override
    public int deleteItem(String id) {
        customerRepo.deleteById(id);
        return 1;
    }

    @Override
    public CustomerInfo updateItem(CustomerInfo item) {
        return customerRepo.save(item);
    }
}