package ComparatorObject;

public class Employee {
	int id;
	
	public Employee(int id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "ID: "+id;	
	}
}
