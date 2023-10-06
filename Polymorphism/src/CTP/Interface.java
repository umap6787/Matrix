package CTP;

interface Student{
	int id=46;
	void dept();
}
class Uma implements Student{
	@Override
	public void dept() {
		System.out.println("Umapathy is a student");		
	}	
}
public class Interface {

	public static void main(String[] args) {
		System.out.println(Student.id);
		Uma s=new Uma();
		s.dept();
	}
}
