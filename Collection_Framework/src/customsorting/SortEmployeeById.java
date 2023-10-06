package customsorting;

import java.util.Comparator;

public class SortEmployeeById implements Comparator <Employee>{
	
	public int compare(Employee x, Employee y) {
		return x.id - y.id;
	}
	}


