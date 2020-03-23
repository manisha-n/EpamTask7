package com.task7.Prototype;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 


public class PrototypeExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
	        System.out.print("Enter Student Id: ");  
	        int id=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Student Name: ");  
	        String name=br.readLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter College Name: ");  
	        String clg_name=br.readLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Branch: ");  
	        String branch=br.readLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter CGPA: ");  
	        float cgpa= Float.parseFloat(br.readLine());  
	        System.out.print("\n");  
	           
	        Student1 s=new Student1(id,name,clg_name,branch,cgpa);  
	          
	        s.showData();  
	        System.out.println("\n");  
	       Student1 s1=(Student1) s.duplicate();  
	        s1.showData();  
	}

}
