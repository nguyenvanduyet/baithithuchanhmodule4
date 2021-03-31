package com.example.baithi.service.city;

import com.example.baithi.model.City;
import com.example.baithi.model.Nation;
import com.example.baithi.repository.CityRepo;
import com.example.baithi.repository.NationalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepo cityRepo;
    @Autowired
    private NationalRepo nationalRepo;
    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        cityRepo.deleteById(id);

    }

    @Override
    public City edit(City city) {
        return cityRepo.save(city);
    }

    @Override
    public City create(City city) {
        return cityRepo.save(city);
    }

    @Override
    public City findByCity(Long id) {
        return cityRepo.findCityById(id);
    }


    @Override
    public City findById(Long id) {
        return cityRepo.getOne(id);
    }

    @Override
    public List<Nation> showAllNational() {
        return nationalRepo.findAll();
    }

}
