package basics1;

public class sumOf10 {

	public static void main(String[] args) {
		System.out.println(value10(3, 2));

	}
		


	

	static boolean value10(int a, int b) {

		if ( a + b == 10) {
			return true;
		}
		
		if(a == 10 || b ==10) {
			return true;
		}
		else
			return false;
		
	}
		
}