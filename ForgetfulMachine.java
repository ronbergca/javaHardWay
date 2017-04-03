/*
 * @Author: Chris Ronberg
 * @Date Created: 3/28/2017
 * @Description: Exercise 7- Getting input from a Human
 * 
 */
 
 import java.util.Scanner;
 
 public class ForgetfulMachine{
 	 public static void main( String [] args ) {
 	 	 Scanner keyboard = new Scanner(System.in);
 	 	 
 	 	 System.out.println( "What city is the capital of France?" );
 	 	 keyboard.next();
 	 	 
 	 	 System.out.println( "what is 6 multiplied by 7?" );
 	 	 keyboard.nextInt();
 	 	 //Blows up when you enter characters or double
 	 	 
 	 	 System.out.println( "Enter a number between 0.0 and 1.0" );
 	 	 keyboard.nextDouble();
 	 	 //Blows up when you enter characters because prompt is looking for and integer or decimal
 	 	 
 	 	 System.out.println( "Is there anything else you would like to say?" );
 	 	 keyboard.next();
 	 	 
 	 }
 }