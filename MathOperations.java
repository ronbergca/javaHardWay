/*
 * @Author: Chris Ronberg
 * @Date Created: 3/28/2017
 * @Description: Exercise 6- Variables and basic math operations.
 * 
 */
 
 public class MathOperations {
 	 public static void main( String[]args) {
 	 		 int a, b, c, d, e, f, g, h, i, add, sub, mul, div, remain;
 	 		 double x, y, z;
 	 		 String one, two, both;
 	 		 
 	 		 a = 10;
 	 		 b = 27;
 	 		 System.out.println( "a is " + a + ", b is " + b );
 	 		 
 	 		 c = a + b;
 	 		 System.out.println( "a+b is " + c );
 	 		 d = a - b;
 	 		 System.out.println( "a-b is " + d );
 	 		 e = a + b * 3;
 	 		 System.out.println( "a+b*3 is " + e );
 	 		 f = b / 2;
 	 		 System.out.println( "b/2 is " + f );
 	 		 g = b % 10;
 	 		 System.out.println( "b%10 is " + g );
 	 		 
 	 		 x = 1.1;
 	 		 System.out.println( "\nx is " + x );
 	 		 y = x*x;
 	 		 System.out.println( "x*x is " + y );
 	 		 z = b / 2;
 	 		 System.out.println( "b/2 is " + z );
 	 		 System.out.println();
 	 		 
 	 		 one = "dog";
 	 		 two = "house";
 	 		 both = one + two;
 	 		 System.out.println( both );
 	 		 
 	 		 h = 20;
 	 		 i = 3;
 	 		 System.out.println( "h is " + h + ", i is " + i );
 	 		 
 	 		 add = h + i;
 	 		 sub = h - i;
 	 		 mul = h * i;
 	 		 div = h / 2;
 	 		 remain = h % 3;
 	 		 
 	 		 System.out.println( "h+i is " +add );
 	 		 System.out.println( "h-i is " +sub );
 	 		 System.out.println( "h*i is " +mul );
 	 		 System.out.println( "h/2 is " +div );
 	 		 System.out.println( "h%i is " +remain );
 	 		  	 		  	 		 
 	 }
 }