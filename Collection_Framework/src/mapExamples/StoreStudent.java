package mapExamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class StoreStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(21);
		Student s2= new Student(22);
		
		LinkedHashMap<Student, String> l=new LinkedHashMap<Student, String>();
		
		l.put(s1,"Arun");		//l.put(new Student(21),"Arun");
		l.put(s2, "Sanjay");	//l.put(new Student(22), "Sanjay");
		
		Set<Student> keys=l.keySet(); //s1 s2
		
		for(Student key:keys) {
			System.out.println(key+"   Name: "+l.get(key));
		}

	}

}
