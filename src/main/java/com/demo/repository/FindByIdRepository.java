package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.DriverLicense;

@Repository
public interface FindByIdRepository extends JpaRepository<DriverLicense, Serializable>{
	public DriverLicense findById(Integer id);
}
