
public class Salary {
	public static void main(String[] args) {
		Employee emp = new Employee("Jatin", "verma",90000);
		emp.setFirstName("Ram");
		System.out.println(emp.salarySlip());
	}
}
