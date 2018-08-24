package com.codemantra;

public class SingletonClass {

	private static SingletonClass obj = null;
	
	private SingletonClass(){
		/**
		 * Prevent the instantiation of
		 * this class directly
		 */
	}
	
	private static SingletonClass objectCreationMethod(){
		if(obj == null){
			obj = new SingletonClass();
		}
		return obj;
	}
	
	public void display(){
		System.out.println("Singleton class example.");
	}
	
	public static void main(String[] args){
		SingletonClass myObj = SingletonClass.objectCreationMethod();
		myObj.display();
	}
}
