package com.cloudschool.registerlogin.repositories;

import com.cloudschool.registerlogin.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
    public List<Customers> findAllByUsername(String username);

    public List<Customers>findAllByCity(String city);

    public List<Customers>findAllByCountry(String country);

    public Customers getById(Integer id);
}
