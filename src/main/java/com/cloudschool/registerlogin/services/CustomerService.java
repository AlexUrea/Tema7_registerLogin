package com.cloudschool.registerlogin.services;

import com.cloudschool.registerlogin.model.Customers;
import com.cloudschool.registerlogin.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customers> findAllByCity(String city){
        return customerRepository.findAllByCity(city);
    }

     public Customers getCustomerById(Integer id){
        return customerRepository.getById(id);
     }

     public void addCustomer(Customers customer){
        customerRepository.save(customer);
     }

     public void deleteCustomerById(Integer id){
        customerRepository.deleteById(id);
     }



}
