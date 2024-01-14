package poo.employee.finance;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double porcentage) {
        double porcetageAfter = porcentage / 100;
        double add = porcetageAfter * grossSalary;
        return add + netSalary();
    }
}

