/*
 * @Author: Chris Ronberg
 * @Date Created: 3/28/2017
 * @Description: Exercise 9- Calculations with user input
 * 
 */
 
 import java.util.Scanner;
 
 public class BMICalculator {
 	 public static void main( String[] args ) {
 	 	 Scanner keyboard = new Scanner(System.in);
 	 	 double inch, lbs, bmi, totalInch, feet;
 	 	 
 	 	 System.out.print( "Your height (feet only): " );
 	 	 feet = keyboard.nextDouble();
 	 	 
 	 	 System.out.print( "Your height (inches only): " );
 	 	 inch = keyboard.nextDouble();
 	 	 
 	 	 System.out.print( "Your weight in lbs: " );
 	 	 lbs = keyboard.nextDouble();
 	 	 
 	 	 totalInch = (feet*12) + inch;
 	  	 	 
 	 	 bmi = (lbs/(totalInch*totalInch))*703;
 	 	 
 	 	 System.out.println( "Your BMI is " + bmi );
 	 	 //book answer is incorrect for 6ft and 9in
 	 }
 }
 
 