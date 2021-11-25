     abstract class Person{
    	private String name;
    	private String address;
    	private String dob;
    	
        public Person(String name,String address,String dob) {
        	this.name=name;
        	this.address=address;
        	this.dob=dob;
        	
        }
	
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
	@Override
     public String toString(){
		 return "NAME = " +name +"\nADDRESS = " +address  + "\nDOB = " +dob +"\n";
	 }
	
	abstract public void qualification();
	
}

class Student extends Person{
	private int rollNo;
	private String course;
	public Student(String name,String address,String dob,int rollNo,String course) {
		super(name,address,dob);
		this.rollNo=rollNo;
		this.course=course;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student \n" +super.toString() +"ROLL NUMBER=" +rollNo +"\nCOURSE=\t" +course ;
	}
	@Override
	public void qualification() {
		System.out.println("Student is in 10th class");
	}
	public void dressColor() {
		System.out.println("THE DRESS COLOR OF STUDENT IS BLUE");
	}
}

 abstract class Employe extends Person{
	int id;
	double salary;
	public Employe(String name,String address,String dob,int id,double salary) {
		super(name,address,dob);
		this.id=id;
		this.salary=salary;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe \n" +super.toString() +"ID = " +id +"\nSALARY = " +salary;
	}
	@Override
	public void qualification() {
		System.out.println("THE EMPOLOYE IS GRADUATE");
	}
}
class FullTime extends Employe{
  private int numberOfHours;
  public FullTime(String name,String address,String dob,int id,double salary,int numberOfHours) {
	  super(name,address,dob,id,salary);
	  this.numberOfHours=numberOfHours;
  }
public int getNumberOfHours() {
	return numberOfHours;
}
public void setNumberOfHours(int numberOfHours) {
	this.numberOfHours = numberOfHours;
}
@Override
public String toString() {
	  return "FullTimeEmploye\n" +super.toString() +"\nHOURS = " +numberOfHours ;
}

public void uniform() {
	System.out.println("THE UNIFORM OF THE EMPLOYEE IS WHITW AND BLACK");
}
   
	
}
class PartTime extends Employe{
	private int numberOfHours;
	public PartTime(String name,String address,String dob,int id,double salary,int numberOfHours) {
		  super(name,address,dob,id,salary);
		  this.numberOfHours=numberOfHours;
	  }
	
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	@Override
	 public String toString() {
		  return "PartTimeEmploye\n" +super.toString() +"\nHOURS = " +numberOfHours ;
	  }
	
	public void casual(){
		System.out.println("THE PART TIME EMPLOYEE WEAR ARBITARY CLOTHES LIKE CASUAL");
	}
}
class Drive{
	static void call(Person person) {//UPCASTING
		System.out.println(person);
		person.qualification();
		if(person instanceof Student) { //DOWNCASTING
			Student student=(Student)person;
			student.dressColor();
			}
		else if(person instanceof FullTime) {
			FullTime employee=(FullTime)person;
			employee.uniform();
		}
		else if(person instanceof PartTime) {
			PartTime employee2=(PartTime)person;
			employee2.casual();
		}
		System.out.println("##############################################################################################");
		
}
}



public class Solution2 {

	public static void main(String[] args) {
		Drive.call(new Student("SAKSHI" ,"DELHI" ,"22/03/2001",59,"B.Tech"));
		Drive.call(new FullTime("SAKSHI" ,"DELHI" ,"22/03/2002",59,20000,8));
		Drive.call(new PartTime("SAKSHI" ,"DELHI" ,"22/03/2002",59,20000,4));
		

	}

}
