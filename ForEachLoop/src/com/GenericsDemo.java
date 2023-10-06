
package com;

import java.util.ArrayList;

class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("java");
		l.add("ak");
		l.add("nk");
		
		for(String s:l) {
			System.out.println(s);
		}
		System.out.println("________--------");
		ArrayList al=new ArrayList();
		al.add(01);
		al.add("strinh");
		al.add(010.0);
		al.add(22);
		for(Object obj:al) {
			System.out.println(obj);
		}
		
		
	}
}

