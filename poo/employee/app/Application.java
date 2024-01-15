package poo.employee.app;

import java.util.Locale;
import java.util.Scanner;
import poo.employee.finance.Employee;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

       System.out.printf("Employee: %s, Net salary: $ %.2f\n", employee.name, employee.netSalary());

       System.out.println("Whinch percentage to increase salary: ");
       double porcentage = sc.nextDouble();

       System.out.printf("Update data: %s, $ %.2f", employee.name, employee.increaseSalary(porcentage));

        sc.close();
    }
}
