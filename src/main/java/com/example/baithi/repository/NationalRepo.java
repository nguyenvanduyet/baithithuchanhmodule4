package com.example.baithi.repository;

import com.example.baithi.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalRepo extends JpaRepository<Nation,Long> {
}
