package com.juaracoding.mfspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/17/2023 7:24 PM
@Last Modified 2/17/2023 7:24 PM
Version 1.0
*/

import com.juaracoding.mfspringbootjpa.configuration.OtherConfig;
import com.juaracoding.mfspringbootjpa.handler.ResponseHandler;
import com.juaracoding.mfspringbootjpa.model.Product;
import com.juaracoding.mfspringbootjpa.repo.ProductRepo;
import com.juaracoding.mfspringbootjpa.utils.ConstantMessage;
import com.juaracoding.mfspringbootjpa.utils.LoggingFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    private ProductRepo productRepo;
    private String [] strExceptionArr = new String[2];

    @Autowired
    public ProductService(ProductRepo productRepo) {
        strExceptionArr[0] = "ProductService";
        this.productRepo = productRepo;
    }

    public ResponseEntity<Object> saveProduct(Product product)
    {
        String strMessage = ConstantMessage.SUCCESS_SAVE;
        try
        {
            productRepo.save(product);
        }
        catch (Exception e)
        {
            strExceptionArr[1]="saveProduct(Product product) --- LINE 38";
            LoggingFile.exceptionStringz(strExceptionArr,e, OtherConfig.getFlagLogging());
            return new ResponseHandler().generateResponse(ConstantMessage.ERROR_SAVE_FAILED,
                    HttpStatus.BAD_REQUEST,null,"FI02001",null);
        }

        return new ResponseHandler().generateResponse(strMessage,
                HttpStatus.CREATED,null,null,null);
    }

    public Page<Product> findPageSortBy(Pageable pageable){

        return productRepo.findAll(pageable);
    }

}
