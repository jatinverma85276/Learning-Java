
abstract class Person{
	Person(String name,int age,String dob){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("DOB : "+dob);
	}
	void hobbies() {
		System.out.println("Hobbies can vary from Student to Employee life");
	}
	abstract void address();
}
abstract class Student extends Person{
	Student(String name,int age, String dob){
		super(name,age,dob);
		schoolName();
		rollNo();
		branch();
		hobbies();
		address();
	}
	final void schoolName() {
		System.out.println("School : GBBIC");
	}
	final void rollNo() {
		System.out.println("Roll No. : 1902310100036");
	}
	void branch() {
		System.out.println("Branch : B.Tech (CSE)");
	}
	
	@Override
	void hobbies() {
		System.out.println("Hobbies are Playing Football, Listening Music");
	}
	@Override
	void address() {
		System.out.println("Address : K5, Chauganpur, Bisrakh Jalalpur, Greater Noida, Uttar Pradesh 203207");
	}
	
}
abstract class Employee extends Student{
	Employee(String name,int age,String dob){
		super(name,age,dob);
		companyName();
		employee_id();
		designation();
		hobbies();
		address();
	}
	final void companyName() {
		System.out.println("Company : JV_Enterprises");
	}
	final void employee_id() {
		System.out.println("Employee ID : 1569");
	}
	void designation() {
		System.out.println("Designation : Software Developer");
	}
	
	@Override
	void hobbies() {
		System.out.println("Hobbies during employee life Reading Books, Listening Music");
	}
	@Override
	void address() {
		System.out.println("Address : GCC2+46M, Block A, Sector 85, Noida, Uttar Pradesh 201305");
	}
}
class FullTimeEmployee extends Employee{
	FullTimeEmployee(String name, int age, String dob){
		super(name,age,dob);
		highSalary();
		
	}
	void highSalary() {
		System.out.println("Full Time Employees payed higher than Part time Employee");
	}
}
class PartTimeEmployee extends Employee{
	PartTimeEmployee(String name, int age, String dob){
		super(name,age,dob);
		lowSalary();
	}
	void lowSalary() {
		System.out.println("Part Time Employees payed lower than Full time Employee");
	}
}

public class ISA_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Jatin",28,"19/11/2002");
		System.out.println("**********************************************");
		PartTimeEmployee partTimeEmp = new PartTimeEmployee("Mohan",29,"09/01/2000");
	}

}
