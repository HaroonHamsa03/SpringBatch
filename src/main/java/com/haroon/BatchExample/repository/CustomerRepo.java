package com.haroon.BatchExample.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haroon.BatchExample.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
