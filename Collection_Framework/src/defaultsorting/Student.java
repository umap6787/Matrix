package defaultsorting;

public class Student implements Comparable<Student>{
	int mark;
	
	Student(int mark){
		this.mark=mark;
	}

	@Override
	public String toString() {
		return "Marks: "+mark;
	}

	public int compareTo(Student s) {
		return this.mark-s.mark;
		
//		this -> current object to be inserted
//		s -> already existing object
	}
}
