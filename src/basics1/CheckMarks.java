package basics1;

public class CheckMarks {
public static void main(String[] args) {
	gradeStudent(76);
}
	
	
	
	static void gradeStudent(int studentScore) {
	
		if(studentScore > 50 && studentScore < 60) 
		System.out.println("Grade D");
	else if(studentScore > 60 && studentScore < 70)
			System.out.println("Grade C");
	else if(studentScore > 70 && studentScore < 80)
			System.out.println("Grade B");
	}
	
	
	
	

}

