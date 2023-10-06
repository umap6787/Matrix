class Inserting {
    public static void main(String[] args) {
        int a = 4546793;
        String res = "";
        while (a != 0) {
            if (a % 2 == 0) {
				int t= a % 10;
                a = a / 10;

                if (a % 2 == 0 && a!=0) {
                    res ="*"+t+res;
                }
				else
					res=t+res;
            }
            if (a % 2 == 1) {
				int t= a % 10;
                a = a / 10;   
                if (a % 2 == 1) {
                    res ="-"+t+res;
                }
				else
					res=t+res;
            }
        }
        System.out.println(res);
    }
}
