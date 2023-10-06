package CTP;

class Myntra{

	void Purchace(String name) {
		System.out.println("Name: "+name);
	}
	void Purchace(int cost) {
		System.out.println("Cost: "+cost);
	}
	void Purchace(String name,int cost) {
		System.out.println("Name: "+name+"  Cost: "+cost);
	}
	void Purchace(int cost,String name) {
		System.out.println("Cost: "+cost+"  Name: "+name);
	}
}

class Solution {

	public static void main(String[] args) {
		Myntra m=new Myntra();
		m.Purchace("LollyPop");
		m.Purchace(10);
		m.Purchace("DairyMilk", 40);
		m.Purchace(5, "HappyHappy");
	}
}
