package com.cognizant.DPT03b;

public class MovableAdapterImpl implements MovableAdapter{
	Movable luxuryCars;
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars=luxuryCars;
	}
	
	@Override
	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph){ 
		return mph * 1.60934; 
	}

	@Override
	public double getPrice() {
		
		return convertUSDtoEuro(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEuro(double usd){ 
		return usd * 0.84; 
	}

}
