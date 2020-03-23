package com.epam.abstract_factory;

public abstract class Computer {
	public abstract String getCpu();
	public abstract String getRam();
	@Override
	public String toString() {
		return "Cpu="+this.getCpu()+"Ram="+this.getRam();
	}


}
