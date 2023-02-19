package com.juaracoding.mfspringbootjpa.controller;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/19/2023 4:02 PM
@Last Modified 2/19/2023 4:02 PM
Version 1.0
*/

import com.juaracoding.mfspringbootjpa.handler.ResponseHandler;
import com.juaracoding.mfspringbootjpa.model.Provinsi;
import com.juaracoding.mfspringbootjpa.service.ProvinsiService;
import com.juaracoding.mfspringbootjpa.utils.ConstantMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/prov")
public class ProvinsiController {
    @Autowired
    private ProvinsiService provinsiService;

    private String [] strExceptionArr = new String[2];

    @PostMapping("/v1/s")
    public ResponseEntity<Object> saveProvinsi(@Valid @RequestBody Provinsi provinsi){

        provinsiService.saveDataProvinsi(provinsi);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_SAVE, HttpStatus.OK,null,null,null);
    }

    @PostMapping("/v1/sl")
    public ResponseEntity<Object> saveProvinsiList(@Valid @RequestBody List<Provinsi> listProvinsi){

        provinsiService.saveAllDataProvinsi(listProvinsi);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_SAVE, HttpStatus.CREATED,null,null,null);

    }
}
