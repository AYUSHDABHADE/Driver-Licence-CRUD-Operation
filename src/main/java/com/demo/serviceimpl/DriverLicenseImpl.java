package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.DriverLicense;
import com.demo.repository.DriverRepository;
import com.demo.repository.FindByIdRepository;
import com.demo.service.DriverService;

@Service
public class DriverLicenseImpl implements DriverService {
	@Autowired
	private DriverRepository driverRepository;
	@Autowired
	private FindByIdRepository findByIdRepository;

	@Override
	public DriverLicense saveOperation(DriverLicense driverLicense) {
		DriverLicense dra=driverRepository.save(driverLicense);
		return dra;
	}
	

	@Override
	public DriverLicense updateOperation(DriverLicense driverLicense) {
		DriverLicense dre = driverRepository.save(driverLicense);
		return dre;
	}

	@Override
	public List<DriverLicense> getOperation(DriverLicense driverLicense) {
		List<DriverLicense> list = driverRepository.findAll();
		return list;
	}

	@Override
	public DriverLicense findById(Integer id) {
		DriverLicense DriverLicense = findByIdRepository.findById(id);
		return DriverLicense;
	}

	@Override
	public String deleteByid(Integer id) {
		driverRepository.deleteById(id);
		return "Delete Operation is Done";
	}

	

	

	

}
