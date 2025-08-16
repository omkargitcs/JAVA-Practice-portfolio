public class Employee{
	private int ecode;
	private double basicSalary;
	private double HRA;
	private double DA;
	private double grossSalary;
	private double PF;
	private double netSalary;
	
	public Employee(){
		this.ecode=0;
		this.basicSalary = 10000;
		computeAllowances();
		calNetSal();
	}
	
	public Employee(int ecode,double basicSalary){
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
	protected void finalize(){
		System.out.println("employee object with ecode: " +ecode+ " is being garbage collceted.");
		super.finalize();
		
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
	

		
	
	
	
	
}
public class Employee{
	public static void main(String[]args){
		Employee emp1 = new Employee();
		emp1.displayDetails();
		Employee emp2 = new Employee(101,34000);
		emp2.displayDetails();
		
		double newNetSalary = emp2.calNetSal(30000);
		System.out.println("updated salary with new basic salary: " + newNet);
	}
	
}