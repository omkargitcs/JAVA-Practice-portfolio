public class Employee1{
	private int ecode;
	private double basicSalary;
	private double HRA;
	private double DA;
	private double grossSalary;
	private double PF;
	private double netSalary;
	
	public Employee1(){
		this.ecode=0;
		this.basicSalary = 10000;
		computeAllowances();
		calNetSal();
	}
	
	public Employee1(int ecode,double basicSalary){
		this.ecode=ecode;
		this.basicSalary = basicSalary;
		computeAllowances();
		calNetSal();
	}
	
	private void computeAllowances(){
		this.HRA=0.20*basicSalary;
		this.DA = 1.27*basicSalary;
		this.grossSalary=basicSalary+HRA+DA;
		this.PF = 0.05*grossSalary;
	}
	
	public double calNetSal(){
		this.netSalary=grossSalary-PF;
		return netSalary;
	}
	
	public double calNetSal(double basicSal){
		this.basicSalary=basicSal;
		computeAllowances();
		this.netSalary=grossSalary-PF;
		return netSalary;
	}

	
	public void displayDetails(){
		System.out.println("employee code : " + ecode);
		System.out.println("basic salary : " + basicSalary);
		System.out.println("HRA : " + HRA);
		System.out.println("DA : " + DA);
		System.out.println("Gross salary : " + grossSalary);
		System.out.println("PF : " + PF);
		System.out.println("Net Salary : " + netSalary);
		
	}
	public static void main(String[] args){
		Employee1 emp1 = new Employee1();
		emp1.displayDetails();
		Employee1 emp2 = new Employee1(101,34000);
		emp2.displayDetails();
		
		double newNetSalary = emp2.calNetSal(30000);
		System.out.println("updated salary with new basic salary: " + newNetSalary);
	}
}
