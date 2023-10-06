package com;
public class Dabbafellow {
	public static void main(String[] args) {
		naguShree(0);
	}
	static void naguShree(int i) {
		if(i<10) {
			System.out.println(i);
			naguShree(i+1);
		}
		System.out.println(i);	
	}
}