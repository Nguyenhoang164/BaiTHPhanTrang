package com.example.customermanagerlist.Repository;

import com.example.customermanagerlist.Model.Customer;
import com.example.customermanagerlist.Model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer , Integer> {
    Page<Customer> findAll(Pageable pageable);
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
