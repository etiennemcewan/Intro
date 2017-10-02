package basics1;

public class weekdayVaction {

	public static void main(String[] args) {
		System.out.println(checkIfISleepIn(true, false));

	}

	static boolean checkIfISleepIn(boolean weekday, boolean vacation) {

		if (!weekday || vacation) {
			return true;
		}

		else
			return false;

	}

}
