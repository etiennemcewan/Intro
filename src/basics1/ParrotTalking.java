package basics1;

public class ParrotTalking {

	public static void main(String[] args) {
		System.out.println(parrot(true, 21));
		

	}
	static boolean parrot(boolean talking , double time) {
		
		if(talking && time < 7 || time > 20) {
			return true;
	}
		else
			return false;
	

}
}
