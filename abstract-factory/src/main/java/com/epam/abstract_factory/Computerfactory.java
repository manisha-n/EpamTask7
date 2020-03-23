package com.epam.abstract_factory;

public class Computerfactory{
	public static  Computer getComputer(Computer_abstractfactory factory) {
		return factory.createComputer();
	}
}