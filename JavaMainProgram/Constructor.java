class Constructor {
	String name;
	long RollNo;
	double perc;

	Constructor(String n, long r, double p) {
		name = n;
		RollNo = r;
		perc = p;
	}

	public static void main(String[] args) {
		Constructor C1 = new Constructor("Umapathy", 110319106046L, 85.6);
		System.out.println(C1.name + " RollNo " + C1.RollNo + " % in his degree");
	}

}
