package mapExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.hasNext());
			System.out.println(i.next());
			System.out.println(i.hasNext());
		}

	}

}
