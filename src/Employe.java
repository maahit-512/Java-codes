abstract class Employees {
    int id;
    double salary;
    String name;
    String add;
    String department;

    Employees(int a, double b, String c, String d, String e) {
        this.id = a;
        this.salary = b;
        this.name = c;
        this.add = d;
        this.department = e;
    }

    abstract double compute_salary();
    public void display(){
        System.out.println("ID: " +id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Department: " + department);
    }
}