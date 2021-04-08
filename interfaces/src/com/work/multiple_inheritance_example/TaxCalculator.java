package com.work.multiple_inheritance_example;

public class TaxCalculator implements StateTax,CentralTax {

	

	@Override
	public void FuelTax() {
		System.out.println("Fuel Tax of centarl");
		
	}

	@Override
	public void liquorTax() {
		System.out.println("Liqour Tax of centarl");
	}

}
