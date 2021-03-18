package com.cognizant.DPT03b;

public class Test {

	public static void main(String[] args) {
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println(bugattiVeyronAdapter.getSpeed());
		System.out.println(bugattiVeyronAdapter.getPrice());

	}

}
