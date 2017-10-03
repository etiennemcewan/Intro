package basics1;

public class comparrisonOfArray {

	public static void main(String[] args) {
		int[] numlist1 = { 1, 2, 3, 4 };
		int[] numlist2 = { 5, 6, 2, 8 };
		//outer  loop
		for (int i = 0; i < numlist1.length; i++) {
			//inner loop
			for (int j = 0; j < numlist2.length; j++) {
				
				if(numlist1[i] == numlist2[j]) {
					System.out.println(numlist1[i]);
				}

			}
		}

	}
}