package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.DriverLicense;
import com.demo.service.DriverService;

@RestController
public class DriverLicenseController {
	@Autowired
	private DriverService driverService;

	@PostMapping("/saveOperation")
	public DriverLicense saveOperation(@RequestBody DriverLicense driverLicense) {
		DriverLicense list = driverService.saveOperation(driverLicense);
		return list;
	}

	@PutMapping("/updateOperation")
	public DriverLicense updateOperation(@RequestBody DriverLicense driverLicense) {
		DriverLicense dri = driverService.updateOperation(driverLicense);
		return dri;
	}

	@GetMapping("/getOperation")
	public List<DriverLicense> getOperation(DriverLicense driverLicense) {
		List<DriverLicense> list2 = driverService.getOperation(driverLicense);
		return list2;

	}

	@GetMapping("/findById/{id}")
	public DriverLicense findById(@PathVariable("id") Integer id) {
		DriverLicense dra = driverService.findById(id);
		return dra;
	}

	@DeleteMapping("/deleteByid/{id}")
	public String deleteByid(@PathVariable("id") Integer id) {
		String str = driverService.deleteByid(id);
		return str;
	}
}
