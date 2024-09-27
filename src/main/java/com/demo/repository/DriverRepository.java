package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.DriverLicense;
@Repository
public interface DriverRepository extends JpaRepository<DriverLicense, Integer>{
	
}
