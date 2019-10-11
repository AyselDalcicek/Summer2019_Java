package day28_JavaRecap;

public class WarmUp_CalculateGrades {

	/*
	 1. write a method that can calculate grade
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
	 */
	
	public static void main(String[] args) {
		
		CalculateGrades(75);
		
		
	}
	
	public static void CalculateGrades (int score) {
		
		char Grade = (score >=90 && score <= 100) ? 'A'
					: (score>=80 && score<=89) ? 'B' : (score>=70 && score<=79) ?  'C'
							: (score>=60 && score<=69) ? 'D' : (score>=50 && score<=59) ? 'F'
									:'I';  //  we ca not write "Invalid Score" MUST be char 
					
		if(Grade == 'I') {
            System.out.println("Invalid Score");
        } else {
            System.out.println(Grade);
        }
		
	}
}
