/*
Author: Gunnar Yonker
Created: 5/25/2022
Description: This is a simple Java program to print a sentence
Observation 1: Error in console, Could not find or load main class Example, MyExample does not match the file name of Example.java. This shows that the class name must match the file .java name to run the program correctly.
Observation 2: An error was shown in the console, Main method not found in class Example. Solution shown in console is to define main method as "public static void main" or a JavaFX application class must extend javafc.application.Application. This shows that the main in "public static void main" must be a lower case m to compile and run properly.
Observation 3: Without comment end, when compiled the error shown is that there is an unexpected end of comment, the following code is treated as a comment without the ending point and does not print the line. When using the backslash backslash for the comments at the head and the backslash asterisk for comments in the main, the code will compile and run with no errors, however it is much easier to have the header comments entered with the backslash asterisk and the comments in the main method entered with backslash backslash.
*/
public class Example {
	//A java program begins with a call to main().
	public static void main(String [] args)
	{
		System.out.println("This is my first Java experience and I am excited to learn more about it so I can create more complex code!");
	}
	
}
