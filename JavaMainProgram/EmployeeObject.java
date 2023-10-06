class EmployeeObject {

    String name;
    int sal;

    EmployeeObject(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public static void main(String[] args) {

        EmployeeObject e1 = new EmployeeObject("Karthi", 500000);
        EmployeeObject e2 = new EmployeeObject("Aravind", 300000);
        EmployeeObject e3 = new EmployeeObject("Sanjay", 350000);
        EmployeeObject e4 = new EmployeeObject("Kamal", 600000);
        EmployeeObject e5 = new EmployeeObject("Umapathy", 999999999);

        EmployeeObject[] e = { e1, e2, e3, e4, e5 };

        EmployeeObject max = e[0];

        EmployeeObject min = e[0];

        for (int i = 1; i < e.length; i++) {

            if (e[i].sal > max.sal) {
                max = e[i];
            }

            if (e[i].sal < min.sal) {
                min = e[i];
            }
        }

        System.out.println("maximum sal is " + max.sal + " for the employee " + max.name);
        System.out.println("minimum sal is " + min.sal + " for the employee " + min.name);

        for (int i = 0; i < e.length; i++) {

            if (e[i].sal > 250000 && e[i].sal < 350000) {
                System.out.println("Salary is between 2.5LPA to 3.5LPA is " + e[i].name + " of salary " + e[i].sal);
            }
        }
    }
}