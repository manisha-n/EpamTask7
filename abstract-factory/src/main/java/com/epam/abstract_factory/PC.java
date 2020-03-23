package com.epam.abstract_factory;

public class PC extends Computer{

	private String ram,cpu;
	PC(String ram,String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

}
