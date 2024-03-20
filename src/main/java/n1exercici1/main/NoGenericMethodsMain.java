package n1exercici1.main;

import n1exercici1.beans.NoGenericMethods;

public class NoGenericMethodsMain {

	
	public static void main(String[] args) {
		
		NoGenericMethods demo1 = new NoGenericMethods("Joan", "Roig", "Barcelona");
		NoGenericMethods demo2 = new NoGenericMethods("Madrid", "Pedro", "González");
		NoGenericMethods demo3 = new NoGenericMethods("Laura", "Zaragoza","Rodríguez");
		
		System.out.println(demo1.toString());
		System.out.println(demo2.toString());
		System.out.println(demo3.toString());

	}

}
