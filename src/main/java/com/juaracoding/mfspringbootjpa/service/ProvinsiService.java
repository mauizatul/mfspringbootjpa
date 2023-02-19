package com.juaracoding.mfspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/19/2023 3:50 PM
@Last Modified 2/19/2023 3:50 PM
Version 1.0
*/

import com.juaracoding.mfspringbootjpa.model.Provinsi;
import com.juaracoding.mfspringbootjpa.repo.ProvinsiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinsiService {
    @Autowired
    private ProvinsiRepo provinsiRepo;
    private String [] strExceptionArr = new String[2];

    public ProvinsiService(ProvinsiRepo provinsiRepo) {
        strExceptionArr[0] = "ProvinsiService";
        this.provinsiRepo = provinsiRepo;
    }

    @Transactional(rollbackFor = Exception.class)
    public void saveDataProvinsi(Provinsi provinsi){
        provinsiRepo.save(provinsi);
    }

    @Transactional(rollbackFor = Exception.class)
    public void saveAllDataProvinsi(List<Provinsi> listProvinsi){
        provinsiRepo.saveAll(listProvinsi);
    }
}
