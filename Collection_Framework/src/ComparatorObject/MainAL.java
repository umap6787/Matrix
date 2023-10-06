package ComparatorObject;

import java.util.ArrayList;
import java.util.Collections;

public class MainAL {

	public static void main(String[] args) {
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(10));
		l.add(new Employee(20));
		l.add(new Employee(30));
		
		Collections.sort(l,new SortEmployee());
		
		for(Employee i:l) {
			System.out.println(i);
		}

	}

}
