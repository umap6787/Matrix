package mapExamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<String, Double>();
		lhm.put("umapathy",5.6);
		lhm.put("nithish", 7.8);
		lhm.put("aravind", 10.2);
		
		Set<String> keys=lhm.keySet();
		
		for(String key:keys) {
			System.out.println("Salary of "+key+" is "+lhm.get(key)+"LPA");
		}
	}
}
