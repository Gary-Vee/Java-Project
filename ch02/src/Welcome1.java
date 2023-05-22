/* public class Welcome1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
// System.out.print("Welcome to Java Programming !");
// back slash 't' means move by a T level \t
// back slash 'n' makes the words go to the next line \n
// System.out.print("Welcome\tto\nJava\nProgramming !");
//System.out.print("Welcome to Java Programming !");


// System.out.print("Welcome to Java Programming !");
System.out.printf("%s%n%s%n" , "Welcome to," , "Java Programming !" );


*/

// This is a different section of coding.



//Fig. 2.7 addition, Java
// Addition program that inputs two numbers then displays their sum


import java.util.Scanner; //program uses class Scanner

public class Welcome1 // AKA Addition. I can't change the "Welcome1" because I have to create a new java thing.
{
//main method begins execution of java application

	public static void main(String[] args) {
			try (// create a Scanner to obtain input from the command window
Scanner input = new Scanner(System.in)) {
	
	System.out.print("Enter first integer: "); //prompt
	
	int number1 = input.nextInt(); // read first number from user
	
	System.out.print("Enter Second integer: "); //prompt
	
	int number2 = input.nextInt();
	
	int sum = number1 + number2; // add numbers, then store total in sum
	
	System.out.printf("Sum is  %d%n ", sum ); // display sum
}

} // end method main

} //end class Addition