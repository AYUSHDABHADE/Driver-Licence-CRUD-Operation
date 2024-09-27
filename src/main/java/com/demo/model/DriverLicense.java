package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "driverlicense")
public class DriverLicense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String driverName;
	private String driverPhonenumber;
	private String licenseId;
	private String licenseType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhonenumber() {
		return driverPhonenumber;
	}

	public void setDriverPhonenumber(String driverPhonenumber) {
		this.driverPhonenumber = driverPhonenumber;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	@Override
	public String toString() {
		return "DriverLicense [id=" + id + ", driverName=" + driverName + ", driverPhonenumber=" + driverPhonenumber
				+ ", licenseId=" + licenseId + ", licenseType=" + licenseType + "]";
	}

}
