package CTP;

class Mobile{
	String s="Application";
}
class WhatsApp extends Mobile{
	String s1="Status";
}
class Instagram extends Mobile{
	String s2="Reels";
}
public class InstanceOf {	
	static void Select(Mobile m) {
		if(m instanceof WhatsApp) {
			System.out.println("WhatsApp application");
			WhatsApp w=(WhatsApp) m;  //Down Casting
			System.out.println(w.s1+" "+w.s);
		}else if(m instanceof Instagram) {
			System.out.println("Instagram application");
			Instagram w=(Instagram) m;  //Down Casting
			System.out.println(w.s2+" "+w.s);
		}
	}
	public static void main(String[] args) {
		Select(new Mobile());
		Select(new WhatsApp());
		Select(new Instagram());
		
	}
}
