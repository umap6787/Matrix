package CTP;
class cab{
	void bookCab() {
		System.out.println("cab booked");
	}
}
class uber extends cab{
	@Override
	void bookCab() {
		System.out.println("uber");
	}
}
class ola extends cab{
	@Override
	void bookCab() {
		System.out.println("ola");
	}
}
class Mobilee{
	static void selectApp(cab b) {
		b.bookCab();
	}
}
public class polymorpism {
	public static void main(String[] args) {
		Mobilee.selectApp(new ola()); //upcasting using method
		Mobilee.selectApp(new uber());
		
		cab b;
		b=new ola();b.bookCab(); //using single reference variable
		b=new uber();b.bookCab();
		
		cab c1=new ola(); c1.bookCab(); //seperate reference variable
		cab c2=new uber(); c2.bookCab();
	}
}
