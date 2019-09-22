package kirksey_p1;
import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int input, x1, x2, x3, x4, output;
	
	System.out.print("Please enter the 4 digit number that you would like to encrypt: ");
	input = scnr.nextInt();
	
	//Separating the digits for encryption
	x1 = input / 1000;
	x2 = (input % 1000) / 100;
	x3 = (input % 100) / 10;
	x4 = input % 10;
	
	//Encrypting each digit
	x1 = (x1 + 7) % 10;
	x2 = (x2 + 7) % 10;
	x3 = (x3 + 7) % 10;
	x4 = (x4 + 7) % 10;
	
	//Combining the digits to form the encrypted number
	output = (x3 * 1000) + (x4 * 100) + (x1 * 10) + x2;
	
	System.out.print("The resulting decrypted number is: " + output);
	}

}
