package ComparatorObject;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(10);
		Employee e2=new Employee(20);
		Employee e3=new Employee(30);
		
		TreeSet<Employee> t=new TreeSet<Employee>(new SortEmployee());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee i:t) {
			System.out.println(i);
		}
	}

}
