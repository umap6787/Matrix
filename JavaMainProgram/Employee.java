class Employee {
    int id;
    String name;
    double salary;

    Employee(String n, int i, double s) {
        this.id = i;
        this.name = n;
        this.salary = s;
    }

    public static void main(String[] args) {
        Employee w1 = new Employee("Nithish", 31, 50000);
        System.out.println(w1.name + "'s employee id=  " + w1.id + " & salary= " + w1.salary + " Rs");

        Employee w2 = new Employee("Arun kumar", 02, 90000);
        System.out.println(w2.name + "'s employee id=   " + w2.id + " & salary= " + w2.salary + " Rs");
    }
}
