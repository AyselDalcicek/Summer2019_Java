package day37_classAndObject;

public class Employees {
	        
				/*
			    Assignment:
			       create a custom class for Employees
			           
			               attributes: EmployeeName
			                           EmployeeID
			                           JobTitle
			                           SSN
			                           Gender
			                           Salary
			                           
			               actions:
			                       getInfo                    
			           
			    */
	
	String EmployeeName;
	long EmployeeID;
	String JobTitle;
	long SSN;
	String Gender;
	short Salary;
	byte Age;
	byte WorkingHours;
	
	
	public void getInfo() {
		System.out.println(EmployeeName+" ID:"+EmployeeID+" "+JobTitle+" SSN:"+SSN+" "+Gender+
				" Salary:"+Salary+"$ "+Age+" years old "+WorkingHours+" working hours per week");
	}
	
	
	

    

}
