import java.util.ArrayList;

public class Employee {
    private ArrayList<Double> salaries;

    public Employee() {
        salaries = new ArrayList<>();
    }

    public void addSalary(double salary) {
        salaries.add(salary);
    }

    public double getAverageSalary() {
        if (salaries.size() == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double salary : salaries) {
            sum += salary;
        }

        return sum / salaries.size();
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.addSalary(50000.0);
        emp.addSalary(60000.0);
        emp.addSalary(70000.0);
        emp.addSalary(80000.0);
        emp.addSalary(90000.0);

        System.out.println("Average salary: " + emp.getAverageSalary());
    }
}
