package com.example.customermanagerlist.Service.impl;

import com.example.customermanagerlist.Model.Province;
import com.example.customermanagerlist.Repository.IProvinceRepository;
import com.example.customermanagerlist.Service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public Optional<Province> findById(int id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void remove(int id) {
      provinceRepository.deleteById(id);
    }
}
