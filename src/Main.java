import java.util.Scanner;
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee type (worker/manager/supervisor): ");
        String employeeType = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Base Salary: ");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        Employees emp = null;
        switch (employeeType) {
            case "worker":
                System.out.print("Enter number of hours worked: ");
                int no_hrs = Integer.parseInt(scanner.nextLine());
                emp = new worker(id, baseSalary, name, address, department, no_hrs);
                break;
            case "manager":
                System.out.print("Enter bonus amount: ");
                double bonus = Double.parseDouble(scanner.nextLine());
                emp = new manager(id, baseSalary, name, address, department, bonus);
                break;
            case "supervisor":
                System.out.print("Enter bonus amount: ");
                double Bonus = Double.parseDouble(scanner.nextLine());
                emp = new manager(id, baseSalary, name, address, department, Bonus);
                break;
            default:
                System.out.println("Invalid employee type entered.");
                scanner.close();
                return;
        }

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + ((Employees)emp).id);
        System.out.println("Name: " + ((Employees)emp).name);
        System.out.println("Address: " + ((Employees)emp).add);
        System.out.println("Department: " + ((Employees)emp).department);
        System.out.println("Calculated Salary: " + ((Employees)emp).compute_salary());
        scanner.close();
    }
}