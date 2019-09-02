package details.project;

import java.util.HashMap;
import java.util.Set;

public class Employee {
	int empNo;
	String empName;
	int sal;
	String designation;

	public Employee(int empNo, String empName, int sal, String designation) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.designation = designation;
	}
    
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Rishah",100,"Developer");
		Employee e2 = new Employee(112,"Kartikey",100,"Developer");
		Employee e3 = new Employee(113,"Prakhar",100,"Developer");
		Employee e4 = new Employee(111,"Rishah",100,"Developer");
		Project p1 = new Project(1,"SecApp",4,"IBM");
		Project p2 = new Project(2,"Website",3,"WP");
		HashMap<Employee,Project> hm = new HashMap<>();
		hm.put(e1, p1);
		hm.put(e2, p2);
		hm.put(e3, p2);
		hm.put(e4, p1);
		Set<Employee> s = hm.keySet();
		for(Employee emp:s){
			System.out.println(emp.empNo);
		}
		
		for(Project p: hm.values()){
			System.out.println(p.projectNo);
		}
		
		
		
		

	}

	@Override
	public int hashCode() {
		
		return empNo;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if(empNo == e.empNo)
			return true;
		else
			return false;
	}

}
