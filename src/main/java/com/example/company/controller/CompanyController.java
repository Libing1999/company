package com.example.company.controller;

//import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.CompanyEntity;
import com.example.company.service.CompanyService;

@RequestMapping("/company")
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/addcompany")
    public CompanyEntity create(@RequestBody CompanyEntity company) {
        return companyService.create(company);

    }

    @GetMapping("/get")
    public List<CompanyEntity> get() {
        return companyService.get();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        companyService.delete(id);
    }

    @GetMapping("/country/{country}")
    public List<CompanyEntity> getCountry(@PathVariable("country") String country) {
        return companyService.getCountry(country);
    }

    @PutMapping("/edit/{id}")
    public CompanyEntity put(@PathVariable("id") Long id, @RequestBody CompanyEntity company) {
        return companyService.put(id, company);
    }

}
