package com.example.company.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.company.entity.CompanyEntity;

@Repository
  public interface CompanyRepository extends JpaRepository<CompanyEntity, Long>{
    List<CompanyEntity> findByCountry(String country);
  }

