package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;


public class SortArrayList {

	public static void main(String[] args) {
		Student s1=new Student(22);
		Student s2=new Student(23);
		Student s3=new Student(21);

		ArrayList<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		Collections.sort(l);	//implicitly call compareTo();
		
		for(Student i:l) {
			System.out.println(i);
		}

	}

}
