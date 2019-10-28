package day37_classAndObject;

public class EmployessObjects {
	
	public static void main(String[] args) {
		
		Employees Empl = new Employees();
		
		Empl.EmployeeName = "Ahmet Dalcicek";
		Empl.EmployeeID = 223_45568_07L;
		Empl.JobTitle = "Marketing Coordinator";
		Empl.SSN =806_78_5890;
		Empl.Gender = "Male";
		Empl.Salary = 8000;
		Empl.Age = 35;
		Empl.WorkingHours = 40;
		
		Empl.getInfo();
		
		
	}
	

}
