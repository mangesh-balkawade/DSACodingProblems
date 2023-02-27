package DesignPatterns;

public class EmployeeBuilder {
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
	
	public Employee employeeBuilder()
	{
		return new Employee(this.id,this.name,this.Salary,this.address);
	}

}
