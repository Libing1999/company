package com.example.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tbl_company")
public class CompanyEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String companyType;
    private String country;
    private String address;
    private Integer numberOfEmp;
    private Long contactNumber;
    private Integer capital;
}
