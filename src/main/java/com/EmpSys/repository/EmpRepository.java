package com.EmpSys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpSys.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
