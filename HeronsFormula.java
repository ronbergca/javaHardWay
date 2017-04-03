public class HeronsFormula {
	public static void main( String[] args ) {
		double a, g, h;
		String tws = "A triangle with sides ";
		
		a = triangleArea(3, 3, 3);
		System.out.println( "A triangle with sides 3,3,3 has area " +a );
		
		a = triangleArea(3, 4, 5);
		System.out.println( "A triangle with sides 3,4,5 has area " +a );
		g = triangleArea(7, 8, 9);
		System.out.println( tws + "7,8,9 has area " +g );
		h = triangleArea(9, 9, 9);
		System.out.println( tws + "9,9,9 has area " +h );
		
		System.out.println(tws + "5,12,13 has area " +triangleArea(5, 12, 13) );
		System.out.println(tws + "10,9,11 has area " +triangleArea(10, 9, 11) );
		System.out.println(tws + "8,15,17 has area " +triangleArea(8, 15, 17) );
		
	}
	
	//computes triangle
	public static double triangleArea( double a, double b, double c ) {
		double s, A;
		
		s = (a+b+c)/2.0;
		A = Math.sqrt(s *(s-a)*(s-b)*(s-c) );
		
		//return value
		return A;
	}
}
// 1) The code without functions is longer and more time consuming
// 2) Harder to edit on other program. have to make the change multiple times rather than once.
// 3) Easy peasy. 