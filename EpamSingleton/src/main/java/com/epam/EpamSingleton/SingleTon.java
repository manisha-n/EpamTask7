package com.epam.EpamSingleton;

public class SingleTon {
	private static SingleTon st=new SingleTon();
	

	private SingleTon() {
		// TODO Auto-generated constructor stub
	}
	public static SingleTon getObject() {
		return st;
	}
	public void show() {
		System.out.println("Its a singleton pattern");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon obj=SingleTon.getObject();
		obj.show();

	}
}


