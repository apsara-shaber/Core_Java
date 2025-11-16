
public class Employee {
	int empID;
	String name;
	double basicSalary;
	
	public Employee(int empID, String name, double basicSalary) {
		this.empID=empID;
		this.name= name;
		this.basicSalary=basicSalary;
	}
	public double calculateHRA() {
		return basicSalary*0.20;// 20% 
	}
	public double calculateDA() {
		return basicSalary*0.10;// 20% 
	}
	
	
	
	
	

}
