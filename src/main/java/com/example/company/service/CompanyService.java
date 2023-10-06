package com.example.company.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.entity.CompanyEntity;
import com.example.company.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity create(CompanyEntity company) {
        return companyRepository.save(company);
    }

    public List<CompanyEntity> get() {
        return companyRepository.findAll();
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

    public List<CompanyEntity> getCountry(String country){
        return companyRepository.findByCountry(country);
    }
}
