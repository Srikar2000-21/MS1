package pracpbm43;

public class Employee extends Person {
	private double salary;
private int yearofjoin;
private String nInsuno;
	
	

	public Employee(String personname, double salary, int yearofjoin, String nInsuno) {
	super(personname);
	this.salary = salary;
	this.yearofjoin = yearofjoin;
	this.nInsuno = nInsuno;
}
	


public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearofjoin() {
		return yearofjoin;
	}

	public void setYearofjoin(int yearofjoin) {
		this.yearofjoin = yearofjoin;
	}

	public String getnInsuno() {
		return nInsuno;
	}

	public void setnInsuno(String nInsuno) {
		this.nInsuno = nInsuno;
	}

public void printemployeedetails()
{
	System.out.println("Name of the person: "+ personname);
	System.out.println("Salary: "+ salary);
	System.out.println("year of joining in the work: "+ yearofjoin);
	System.out.println("National insurance number: "+ nInsuno);
}
	
	

}
