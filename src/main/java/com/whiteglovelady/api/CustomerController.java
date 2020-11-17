package com.whiteglovelady.api;

import com.whiteglovelady.model.Customer;
import com.whiteglovelady.model.CustomerInfo;
import com.whiteglovelady.serves.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//This is a Java Bean
@RequestMapping("/api/Customer")//everything related to inventory
public class CustomerController
{
    private CustomerService customerService;

    @Autowired//Example of an Index injection
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }
    @GetMapping("/{id}")//Path to REST Call
    public CustomerInfo dummy(@PathVariable String id)
    {
        return customerService.getItem(id);
    }
    @GetMapping
    public Customer getAllItems()
    {
        return customerService.getAll();
    }

    @DeleteMapping("/{id}")
    public CustomerInfo deleteItem(@PathVariable String id)
    {
        return customerService.getItem(id);
    }

    @PostMapping
    public CustomerInfo addItem(@RequestBody CustomerInfo items)
    {
        return customerService.addItem(items);
    }

    @PutMapping
    public  CustomerInfo updateItem(@RequestBody CustomerInfo items)
    {
        return customerService.updateItem(items);
    }

}