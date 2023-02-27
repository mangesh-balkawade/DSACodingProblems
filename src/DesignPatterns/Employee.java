package DesignPatterns;

public class Employee {
	private Integer id;
	private String name;
	private Double Salary;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee(Integer id, String name, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		//Employee e1=new EmployeeBuilder().employeeBuilder().setAddress("Darwali").;
	}
	

}
