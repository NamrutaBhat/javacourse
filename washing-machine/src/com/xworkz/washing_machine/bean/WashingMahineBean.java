package com.xworkz.washing_machine.bean;

public class WashingMahineBean {
	private int washingMachineId;
	private String capacity;
	private double cost;
	private String brand;
	private String type;
	
	public WashingMahineBean ()
	{
		System.out.println(this.getClass().getSimpleName()+"  created");
	}

	public int getWashingMachineId() {
		return washingMachineId;
	}

	public void setWashingMachineId(int washingMachineId) {
		this.washingMachineId = washingMachineId;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "WashingMahineBean [washingMachineId=" + washingMachineId + ", capacity=" + capacity + ", cost=" + cost
				+ ", brand=" + brand + ", type=" + type + "]";
	}
	
	

}
