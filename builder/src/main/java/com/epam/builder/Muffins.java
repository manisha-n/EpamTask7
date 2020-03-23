package com.epam.builder;

public class Muffins {

	 private final double golden_caster_sugar;   
	    private final double vegetableoil;  
	    private final int eggs;
	    private final int salt;     
	    private final double self_raising_flour;   
	    private final double bakingpowder; 
	    private final double skimmed_milk;  
	    private final int chocochips;

	    public static class Builder {

	    	private double golden_caster_sugar;   
	        private double vegetableoil;  
	        private int eggs;
	        private int salt;     
	        private double self_raising_flour;   
	        private double bakingpowder; 
	        private double skimmed_milk;  
	        private int chocochips;

	        //builder methods for setting property
	        public Builder golden_caster_sugar(double cup){
	        	this.golden_caster_sugar = cup; 
	        	return this; 
	        }
	        public Builder vegetableoil(double cup){
	        	this.vegetableoil = cup; 
	        	return this; 
	        }
	        public Builder eggs(int n){
	        	this.eggs = n; 
	        	return this; 
	        }
	        public Builder salt(int tbsp){
	        	this.salt = tbsp; 
	        	return this; 
	        }
	        public Builder self_raising_flour(double cup){
	        	this.self_raising_flour = cup; 
	        	return this; 
	        }
	        public Builder bakingpowder(double cup){
	        	this.bakingpowder = cup; 
	        	return this; 
	        }
	        public Builder skimmed_milk(double cup){
	        	this.skimmed_milk = cup; 
	        	return this; 
	        }
	        public Builder chocochips(int cup){
	        	this.chocochips = cup; return this; 
	        }
	        
	        
	        public Muffins build() {
	            return new Muffins(this);
	        }
	    }

	    
	    private Muffins(Builder builder) {
	        this.golden_caster_sugar = builder.golden_caster_sugar;
	        this.vegetableoil = builder.vegetableoil ;
	        this.eggs = builder.eggs;
	        this.salt = builder.salt;
	        this.self_raising_flour = builder.self_raising_flour;
	        this.bakingpowder = builder.bakingpowder;
	        this.skimmed_milk = builder.skimmed_milk;
	        this.chocochips = builder.chocochips;      
	    }

	    @Override
	    public String toString() {
	        return "Muffins{" 
	    + "golden_caster_sugar=" + golden_caster_sugar + 
	    ", vegetableoil=" + vegetableoil + 
	    ", eggs=" + eggs +
	    ", salt=" + salt +
	     ", self_raising_flour=" + self_raising_flour +
	    ", bakingpowder=" + bakingpowder +
	    ", skimmed_milk=" + skimmed_milk +
	    ", chocochips=" + chocochips + '}';

	    }
}
