package com.juaracoding.mfspringbootjpa.repo;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/9/2023 8:29 PM
@Last Modified 2/9/2023 8:29 PM
Version 1.0
*/

import com.juaracoding.mfspringbootjpa.model.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoryProductRepo extends JpaRepository<CategoryProduct,Long> {


    List<CategoryProduct> findByNameCategoryProduct(String value);

    /*
        findByNameCategoryProduct
        SELECT * FROM MstCategoryProduct WHERE NameCategoryProduct = ?
    */
}
