package com.juaracoding.mfspringbootjpa.utils;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/17/2023 7:11 PM
@Last Modified 2/17/2023 7:11 PM
Version 1.0
*/

import org.springframework.web.multipart.MultipartFile;

public class ExcelReader {

    public static boolean isExcel(MultipartFile multipartFile)
    {
        if(!ConstantMessage.CONTENT_TYPE_XLS.equals(multipartFile.getContentType()) && !ConstantMessage.CONTENT_TYPE_XLSX.equals(multipartFile.getContentType()))
        {
            return false;
        }
        return true;


//        if(ConstantMessage.CONTENT_TYPE_XLS.equals(multipartFile.getContentType()) || ConstantMessage.CONTENT_TYPE_XLSX.equals(multipartFile.getContentType()))
//        {
//            return true;
//        }
//        return false;
    }
}