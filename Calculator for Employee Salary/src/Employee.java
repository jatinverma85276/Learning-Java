
public class Employee {
	private String FirstName;
	private String LastName;
	private int Salary;
	private String Company;
	public Employee() {
		Company= "JV_Enterprises";
	}
	public Employee(String firstName, String lastName, int salary) {
		this();
		FirstName = firstName;
		LastName = lastName;
		Salary = salary;
	}
	
	double hra() {
		return Salary * 0.50;
	}
	double da() {
		return Salary * 0.15;
	}
	double ta() {
		return Salary * 0.30;
	}
	double ma() {
		return Salary * 0.20;
	}
	double pf() {
		return Salary * 0.05;
	}
	double gs() {
		return Salary+hra()+ta()+da()+ma();
	}
	double ns() {
		return gs()-pf()-tax();
	}
	double tax() {
		return Salary * 0.10;
	}
	public String salarySlip() {
		return  "Company : " + Company + "\nName : " + FirstName + "\nSalary : " + Salary + "\nGS : "+CommonUtils.getSalaryFormat(gs())+"\nNS : "+CommonUtils.getSalaryFormat(ns());
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", Salary=" + Salary + "]";
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
}
