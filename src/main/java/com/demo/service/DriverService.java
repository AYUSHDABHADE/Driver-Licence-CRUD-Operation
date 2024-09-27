package com.demo.service;

import java.util.List;

import com.demo.model.DriverLicense;

public interface DriverService {
    // all crud operation of user
	public DriverLicense saveOperation(DriverLicense driverLicense);

	public DriverLicense updateOperation(DriverLicense driverLicense);

	public List<DriverLicense> getOperation(DriverLicense driverLicense);

	public DriverLicense findById(Integer id);

	public String deleteByid(Integer id);

}
