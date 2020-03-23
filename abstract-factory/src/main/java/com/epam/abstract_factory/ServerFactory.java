package com.epam.abstract_factory;

public class ServerFactory implements Computer_abstractfactory {

private String ram;
	
	private String cpu;
	
	public ServerFactory(String ram, String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,cpu);
	}
}
