import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready = "yes", prompt;
		
		System.out.println( "Are you ready? Yes or No?" );
		prompt = keyboard.next();
		
		while (! prompt.equalsIgnoreCase(ready) ) {
				System.out.println( "Are you ready? Yes or No?" );
				prompt = keyboard.next();
		}			

		System.out.println( "Give me a number, and I'll find it's square root. ");
		System.out.println( "(No negatives, please.) ");
		x = keyboard.nextInt();
		
		while ( x < 0 ) {
			System.out.println( "I won't take the square root of a negative.");
			System.out.println( "\nNew number: ");
			x = keyboard.nextInt();
		}
		
		y = Math.sqrt(x);
		
		System.out.println( "The square root of "+x+" is "+y);
	}
}