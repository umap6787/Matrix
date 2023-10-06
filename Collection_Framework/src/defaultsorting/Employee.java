package defaultsorting;

public class Employee implements Comparable<Employee>{

	String name;

	public Employee(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Name: "+name;
	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}
}
/**
 * this -> current object to be inserted and e -> already existing object
 * 
 * For String comparison we cannot use (-), we have to compareTo() of String class.
 * 
 * 1.Ascending order -> return this.name.compareTo(e.name);
 * 2.Descending order -> return e.name.compareTo(this.name);
 */
