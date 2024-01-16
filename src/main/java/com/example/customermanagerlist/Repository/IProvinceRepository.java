package com.example.customermanagerlist.Repository;

import com.example.customermanagerlist.Model.Province;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province,Integer> {

}
