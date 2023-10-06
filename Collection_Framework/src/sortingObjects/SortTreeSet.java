package sortingObjects;

import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
		Student s1=new Student(22);
		Student s2=new Student(23);
		Student s3=new Student(21);

		TreeSet<Student> t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student i:t) {
			System.out.println(i);
		}
	}

}
