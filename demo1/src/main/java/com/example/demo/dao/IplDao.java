package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.services.Employee;

@Repository
public interface IplDao extends JpaRepository<Employee, Integer> {

}
