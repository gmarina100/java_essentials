package chars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
		//Imprime el abecedario y su código ascii
	    for (int i = 65; i < 65 + 26; i++)
	    {
	        Input.print((char) i + " is " + i + "\n");
	    }

	}

}
