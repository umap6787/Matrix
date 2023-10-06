package RTP;

class Employee{
	void work() {
		System.out.println("Employee is Working");
	}
}
class Developer extends Employee{ //rule-1
	@Override
	void work() {  //rule-2
		System.out.println("Developing App");
	}
}
class Tester extends Employee{  //rule-1
	@Override
	void work() {  //rule-2
		System.out.println("Testing App");
	}
}
class Solution {
	
	//1. Employee emp=new Developer();
	//2. Employee emp=new Tester();
	static void Display(Employee emp) {  //Specialization
		emp.work();
	}

	public static void main(String[] args) {
		
		Display(new Developer());
		Display(new Tester());
		
		System.out.println("-----------------");
		
		Employee e1=new Developer();  //rule-3
		e1.work();
		
		Employee e2=new Tester();  //rule-3
		e2.work();
		
		System.out.println("*****************");
		
		Employee emp;  //Super class reference
		emp=new Developer();	//rule-3
		emp.work();
		
		emp=new Tester();	//rule-3
		emp.work();
	}

}
