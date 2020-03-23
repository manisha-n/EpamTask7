package com.task7.Prototype;
public class Student1 implements Prototype {
    
	   private int sid;  
	   private String name,college_name,branch; 
	   private float cgpa;
	      
	   public Student1(){  
	            System.out.println("             Student Data                    ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("Id"+"\t"+"Name"+"\t"+"College"+"\t"+"Branch"+"\t"+"CGPA");  
	      
	}  
	  
	 public  Student1(int sid, String name, String college_name, String branch,float cgpa) {  
	          
	        this();  
	        this.sid = sid;  
	        this.name = name;  
	        this.college_name = college_name;  
	        this.branch = branch;  
	        this.cgpa = cgpa;  
	    }  
	      
	  public void showData(){  
	          
	        System.out.println(sid+"\t"+name+"\t"+college_name+"\t"+branch+"\t"+cgpa);  
	   }  
	  
	    public Prototype duplicate() {  
	          
	        return new Student1(sid,name,college_name,branch,cgpa);  
	    }  
	}

