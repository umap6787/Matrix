package sortingObjects;

class Student implements Comparable<Student> {
	int age;

	Student(int age) {
		this.age=age;
	}

	@Override
	public String toString() {
		return "Age: "+age;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.age-s.age;
	}
}