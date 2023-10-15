package com.example.company.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.company.entity.CompanyEntity;
import com.example.company.repository.CompanyRepository;

import jakarta.transaction.Transactional;

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

    public List<CompanyEntity> getCountry(String country) {
        return companyRepository.findByCountry(country);
    }

    @Transactional
    public void put(Long id, CompanyEntity company) {
        CompanyEntity entity = null;
        try {
            entity = companyRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Company with " + id + " does not exist ");
        }
        if (company.getName() != null) {
            entity.setName(company.getName());
        }
        if (company.getAddress() != null) {
            entity.setAddress(company.getAddress());
        }
        if (company.getCompanyType() != null) {
            entity.setCompanyType(company.getCompanyType());
        }
        if (company.getCapital() != null) {
            entity.setCapital(company.getCapital());
        }
        if (company.getCountry() != null) {
            entity.setCountry(company.getCountry());
        }
        if (company.getContactNumber() != null) {
            entity.setContactNumber(company.getContactNumber());
        }
        if (company.getNumberOfEmp() != null) {
            entity.setNumberOfEmp(company.getNumberOfEmp());
        }

    }
}
