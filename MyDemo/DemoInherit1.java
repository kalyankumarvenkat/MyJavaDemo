class Employee1{  
 float salary=40000;  
}  

class Programmer extends Employee1{  
	 int bonus=10000;  
}

class EmployeeEducation extends Programmer{  
	 int val1=2000;  
}

public class DemoInherit1 {
	 public static void main(String args[]){  
		 EmployeeEducation p=new EmployeeEducation();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);
		   System.out.println("Eduction value is:"+p.val1);  

		}  
	}  

