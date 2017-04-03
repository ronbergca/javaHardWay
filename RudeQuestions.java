/*
 * @Author: Chris Ronberg
 * @Date Created: 3/28/2017
 * @Description: Exercise 8- Storing input
 * 
 */
 
 import java.util.Scanner;
 
 public class RudeQuestions {
 	 public static void main( String[] args ) {
 	 	 String name, color;
 	 	 int age;
 	 	 double weight, income;
 	 	 
 	 	 Scanner keyboard = new Scanner(System.in);
 	 	 
 	 	 System.out.print( "Hello. What is your name?" );
 	 	 name = keyboard.next();
 	 	 
 	 	 System.out.print( "Hi, " + name + "! How old are you? " );
 	 	 age = keyboard.nextInt();
 	 	 
 	 	 System.out.println( "So you're " + age + ", eh? That's not very old." );
 	 	 System.out.print( "How much do you weigh, " + name + "? " );
 	 	 weight = keyboard.nextDouble();
 	 	 
 	 	 System.out.println( weight + "! Better keep that quiet!!" );
 	 	 System.out.print( "Finally, what's your income, " + name + "? " );
 	 	 income = keyboard.nextDouble();
 	 	 
 	 	 System.out.print( "Hopefully that is " + income + " per hour" );
 	 	 System.out.println( " and not per year!" );
 	 	 System.out.print( "Well, thanks for answering my rude questions, " );
 	 	 System.out.println( name + "." );
 	 	 
 	 	 System.out.print( "Oh yea, one more question. What color is your hair?" );
 	 	 color = keyboard.next();
 	 	 System.out.println( "Right on, you have " + color + " hair!");
 	 }
 }
 
 /*	1. No. Double will accept integer but not vice versa.
 	2. No. Numbers would also count as characters but not vice versa.
 	3. Answered above.
 	4. 
 */