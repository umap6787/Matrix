package defaultsorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Student s1= new Student(87);
		Student s2= new Student(96);
		Student s3= new Student(100);

		TreeSet<Student> t= new TreeSet<Student>();
		t.add(s1);// compareTo();//t.add(new Student(87));
		t.add(s2);//t.add(new Student(96));
		t.add(s3);//t.add(new Student(100));
		
		for(Student s:t) {
			System.out.println(s);
		}
		
		Employee e1= new Employee("impuuu");
		Employee e2= new Employee("naguuu");
		Employee e3= new Employee("Aishuuu");
		
		TreeSet<Employee> t1= new TreeSet<Employee>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		for(Employee s:t1) {
			System.out.println(s);
		}
	}
}
