package com.epam.abstract_factory;

public class Main {

	public static void main(String[] args) {
		testAbstractfactory();
	}
	private static void testAbstractfactory() {
		Computer pc = Computerfactory.getComputer(new PCFactory("2 GB","2.4 GHz"));
		Computer server = Computerfactory.getComputer(new ServerFactory("16 GB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}


}
