package com.cognizant.DPT02b;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		
		return new MercedesTire();
	}

}
