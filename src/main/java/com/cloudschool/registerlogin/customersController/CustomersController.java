package com.cloudschool.registerlogin.customersController;


import com.cloudschool.registerlogin.model.Customers;
import com.cloudschool.registerlogin.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/id/{id}")
    public Customers getCustomerById(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer")
    public void createCustomer(@RequestBody Customers customer){
        customerService.addCustomer(customer);
    }
}
