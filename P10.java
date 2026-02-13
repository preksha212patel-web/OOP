import java.util.Scanner;

class P10
{
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData()
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args)
    {
        P10 emp = new P10();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}