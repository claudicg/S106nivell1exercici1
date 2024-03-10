package n1exercici1.main;

import n1exercici1.beans.NoGenericMethods;

public class NoGenericMethodsMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		NoGenericMethods demo1 = new NoGenericMethods(3, 3, "Casa");
		NoGenericMethods demo2 = new NoGenericMethods("Porta", 10.7, 1.5);
		NoGenericMethods demo3 = new NoGenericMethods(34, "Finestra", 1);
		
		System.out.println(demo1.toString());
		System.out.println(demo2.toString());
		System.out.println(demo3.toString());

	}

}
