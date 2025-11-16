
public class FullTimeEmployee extends Employee{
	double bonus;
	double pf;
	
	public FullTimeEmployee (int empID, String name, double basicSalary,double bonus,double pf) {
		super(empID, name, basicSalary);
		this.bonus=bonus;
		this.pf=pf;
	}
	public double calculateGrossSalary() {
		return basicSalary +calculateHRA()+calculateDA()+bonus-pf;
	}
	

}
