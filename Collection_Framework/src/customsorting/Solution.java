package customsorting;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		
		Employee e1=new Employee(2,"umap",3.8);
		Employee e2=new Employee(1,"Arav",3.7);
		Employee e3=new Employee(3,"sanj",3.9);
		
		SortEmployeeById id=new SortEmployeeById();
		SortEmployeeByName name=new SortEmployeeByName();
		
		TreeSet<Employee> t=new TreeSet(name);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e:t) {
			System.out.println(e);
		}
		
	}

}
