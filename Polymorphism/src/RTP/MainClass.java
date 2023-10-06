package RTP;

class FoodDeliveryApp{
	void order() {
		System.out.println("Ordering Food");
	}
}
class Swiggy extends FoodDeliveryApp{
	@Override
	void order() {
		System.out.println("Food Order in Swiggy");
	}
}
class Zamoto extends FoodDeliveryApp{
	@Override
	void order() {
		System.out.println("Food Order in Zamoto");
	}
}

public class MainClass {
	static void display(FoodDeliveryApp food) {
		food.order();
	}

	public static void main(String[] args) {
		display(new Swiggy());
		display(new Zamoto());
		
		
		System.out.println("---------------------");
		FoodDeliveryApp f1=new Swiggy(); //with different variable
		f1.order();
		FoodDeliveryApp f2=new Zamoto();
		f2.order();

	}

}
