package com.PojoTest;

public class Data {

	/*
		   "data": {
		      "year": 2019,
		      "price": 1849.99,
		      "CPU model": "Intel Core i9",
		      "Hard disk size": "1 TB"
		   }
		*/
	
	private int year;
	private double price;
	private String cpuModel;
	private String hardDiskSize;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCpuModel() {
		return cpuModel;
	}
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}
	public String getHardDiskSize() {
		return hardDiskSize;
	}
	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}
	
}
