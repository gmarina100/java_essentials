package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.print("Ëscribe un número flotante:");
		float f = Input.get_float();
		System.out.print("Ëscribe un número flotante:");
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
