/*
 * @Author: Chris Ronberg
 * @Date Created: 3/28/2017
 * @Description: Exercise 5- Saving info in variables and calling them for display.
 * 
 */
 
 public class CreatingVariables {
 	 public static void main( String[]args ){
 	 	 int x, y, age, z;
 	 	 double seconds, e, checking, minutes;
 	 	 String firstName, lastName, title, middleName;
 	 	 
 	 	 x = 10;
 	 	 y = 400;
 	 	 age = 39;
 	 	 z = 522;
 	 	 
 	 	 seconds = 4.71;
 	 	 e =  2.71828182845904523536;
 	 	 checking = 1.89;
 	 	 minutes = 4.5;
 	 	 
 	 	 firstName = "Graham";
 	 	 lastName = "Mitchell";
 	 	 title = "Mr.";
 	 	 middleName = "Jack";
 	 	 
 	 	 System.out.println( "The variable x contains " + x );
 	 	 System.out.println( "The value " + y + " is stored in the variable y." );
 	 	 System.out.println( "The value " + z + " is stored in the variable z." );
 	 	 System.out.println( "The experiment took " + minutes + " minutes and " + seconds + " seconds." );
 	 	 System.out.println( "A favorite irrational # is Euler's number: " + e );
 	 	 System.out.println( "Hopefully you have more than $" + checking + "!" );
 	 	 System.out.println( "My name's " + title + " " + firstName + middleName + lastName );
 	 }
 }
 	 	 