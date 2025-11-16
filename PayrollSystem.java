import java.util.*;
public class PayrollSystem {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		ArrayList<FullTimeEmployee> employees =new ArrayList<>();
		System.out.println("enter num of employees");
		int n =scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter employe"+(i+1)+"Detials: ");
			
			System.out.println("id");
			int id= scan.nextInt();
			
			System.out.println("Name");
			String name = scan.nextLine();
			
			System.out.println("Basicsalary");
			double salary=scan.nextDouble();
			
			System.out.println("bonus");
			double bonus=scan.nextDouble();
			
			System.out.println("pf");
			double pf=scan.nextDouble();
			
			employees.add(new FullTimeEmployee(id,name,salary,bonus,pf));
			}
		
		System.out.println("...........payroll details..............");
		for(FullTimeEmployee emp: employees) {
			System.out.println("ID"+emp.empID);
			System.out.println("Name: "+emp.name);
			System.out.println("grosssalary"+emp.calculateGrossSalary());
			System.out.println("-----------------------------------");
		}
		
		
	}
	

}
