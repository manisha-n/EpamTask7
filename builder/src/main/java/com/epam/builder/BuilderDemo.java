package com.epam.builder;

public class BuilderDemo {

	public static void main(String args[]) {
	    
	    //Creating object using Builder pattern in java
	    Muffins chocochipMuffin = new Muffins.Builder().golden_caster_sugar(3).vegetableoil(1).eggs(4).salt(1).self_raising_flour(1.5). bakingpowder(0.75).skimmed_milk(0.5).chocochips(2).build();
	 
	    //Cake is ready to eat :)
	    System.out.println(chocochipMuffin);
	}
}
