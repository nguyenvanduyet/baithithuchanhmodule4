package com.example.baithi.service.city;

import com.example.baithi.model.City;
import com.example.baithi.model.Nation;
import com.example.baithi.service.IService;

import java.util.List;

public interface ICityService extends IService<City> {
    City findByCity(Long id);
    City findById(Long id);
    List<Nation> showAllNational();
}
