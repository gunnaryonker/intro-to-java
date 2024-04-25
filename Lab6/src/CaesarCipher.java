/*
 * Author: Gunnar Yonker
 * Created: 6/12/2022
 * Description: Create a caesar cipher program that asks for plain text and then encrypts it into ciphertext, and also a decryption algorithm that
 * asks for the ciphertext and produces the plaintext
 */
import java.util.*;

public class CaesarCipher {
	public static void main(String args[])
	{
		//Create a scanner and declare variables for choice of encryption or decryption
		Scanner scanner = new Scanner(System.in);
		String encryption = "Encryption";
		String decryption = "Decryption";
		String cipherchoice = "";
		
		//Declare variables for encryption and decryption algorithms
		String sentence = "";
		String plaintext = "", ciphertext = "";
		int shift=3;
		char character;
		
		//Ask if user would like encrypt or decrypt a message
		System.out.println("Caesar Cipher");
		System.out.println("Encryption or Decryption? ");
		cipherchoice = scanner.nextLine();
		
		//Encryption Algorithm
		if(cipherchoice.equals(encryption))
		{
		//Ask for input of sentence to encrypt
		System.out.println("Enter the sentence to encrypt: ");
		plaintext = scanner.nextLine();
		//Check each letter of the entered sentence to make sure it is within a and z, use the shift of 3 to get the new assigned letter
		for(int i = 0; i < plaintext.length(); ++i){
			character = plaintext.charAt(i);
			if(character >= 'a' && character <= 'z')
			{
		       character = (char)(character + shift);
		            
		        if(character > 'z')
		            {
		                character = (char)(character - 'z' + 'a' - 1);
		            }
		            
		            ciphertext += character;
		        }
		        else
		        {
		         ciphertext += character;
		        }
		}
		System.out.println("Ciphertext is: " + ciphertext);
		}
		//Decryption Algorithm
		if(cipherchoice.equals(decryption))
		{
			//Ask user to input the encrypted sentence
			System.out.println("Enter the encrypted sentence: ");
			ciphertext = scanner.nextLine();
			
			//Run the decryption algorithm on the sentence, do the same as the encryption but instead of adding the shift of 3 forward you minus the shift to go backwards 3 characters
			for(int i = 0; i < ciphertext.length(); ++i){
			character = ciphertext.charAt(i);
			if(character >= 'a' && character <= 'z'){
			            character = (char)(character - shift);
			            
			            if(character < 'a'){
			                character = (char)(character + 'z' - 'a' + 1);
			            }
			            
			            plaintext += character;
			        }
			        else {
			         plaintext += character;
			        }
			}
			System.out.println("Plaintext is: " + plaintext);
	}		
	}
}

