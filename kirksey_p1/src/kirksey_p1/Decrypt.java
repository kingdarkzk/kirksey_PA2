package kirksey_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int input, x1, x2, x3, x4, output;
		
	System.out.print("Please enter the number that you would like to decrypt: ");
	input = scnr.nextInt();
		
	//Separating the digits for decryption
	x1 = input / 1000;
	x2 = (input % 1000) / 100;
	x3 = (input % 100) / 10;
	x4 = input % 10;
		
	//Decrypting each digit
	x1 = (x1 + 3) % 10;
	x2 = (x2 + 3) % 10;
	x3 = (x3 + 3) % 10;
	x4 = (x4 + 3) % 10;
		
	//Combining the digits to form the decrypted number
	output = (x3 * 1000) + (x4 * 100) + (x1 * 10) + x2;
		
	System.out.print("The resulting decrypted number is: " + output);

	}

}
