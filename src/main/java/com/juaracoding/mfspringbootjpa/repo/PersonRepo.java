package com.juaracoding.mfspringbootjpa.repo;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/17/2023 7:19 PM
@Last Modified 2/17/2023 7:19 PM
Version 1.0
*/

import com.juaracoding.mfspringbootjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo  extends CrudRepository<Person,Long> {

    List<Person> findByFirstName(String val);

}