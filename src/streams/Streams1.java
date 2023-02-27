package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	int salary;
	String city;

	public Employee(int id, String name, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	

}

public class Streams1 
{
  public static void main(String[] args) {
	ArrayList<Employee> list1=new ArrayList<>();
	list1.add(new Employee(1,"Mangesh", 27000,"Pune"));
	list1.add(new Employee(2,"Shubham", 13000,"Pune"));
	list1.add(new Employee(3,"Ram", 14000,"Nashik"));
	list1.add(new Employee(4,"Om", 10000,"Nashik"));
	list1.add(new Employee(5,"Sai", 10000,"Delhi"));
	
	
	
	// Sorted(Comparator )
	List<Employee> sort= list1.stream().sorted((e1,e2)->e2.salary-e1.salary).collect(Collectors.toList());
	sort.forEach(e->System.out.println(e));
	System.out.println("_________________________________________________");
	
	// Limit (Integrer 3= 3 rows)
	List<Employee> max3=list1.stream().sorted((e1,e2)->e2.salary-e1.salary).limit(3).collect(Collectors.toList());
	max3.forEach(e->System.out.println(e));
	System.out.println("_________________________________________________");
	
	// Group By  Map Return karat key as no of found ani value as List Employee
	Map<String, List<Employee>> gp1=list1.stream().collect(Collectors.groupingBy(e->e.city));
	gp1.keySet().stream().forEach(key->System.out.println(gp1.get(key)));
	System.out.println("_________________________________________________");
	
	//Group BY and oly unique elements override equals and hashcode method
	Map<String, Set<Employee>> gpunique=list1.stream().collect(Collectors.groupingBy(e->e.city,Collectors.toSet()));
	gpunique.keySet().stream().forEach(key->System.out.println(gp1.get(key)));
	System.out.println("_________________________________________________");
	
	
	//Group BY City Sort By Maping Keys 
	Map<String, Set<Employee>> gpuniqueSort=list1.stream().collect(Collectors.groupingBy
			(e->e.city,TreeMap::new,Collectors.toSet()));
	gpuniqueSort.keySet().stream().forEach(key->System.out.println(gp1.get(key)));
	System.out.println("_________________________________________________");
		
}
}
