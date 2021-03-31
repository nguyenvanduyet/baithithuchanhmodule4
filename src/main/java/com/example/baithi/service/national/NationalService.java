package com.example.baithi.service.national;

import com.example.baithi.model.Nation;
import com.example.baithi.repository.NationalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalService implements INationalService {
    @Autowired
    private NationalRepo nationalRepo;
    @Override
    public List<Nation> findAll() {
        return nationalRepo.findAll();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Nation edit(Nation nation) {
        return null;
    }

    @Override
    public Nation create(Nation nation) {
        return null;
    }
}
