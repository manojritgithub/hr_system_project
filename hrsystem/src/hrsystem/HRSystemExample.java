package hrsystem;

public class HRSystemExample {
    public static void main(String[] args) {
        // Create HR System
        HRSystem hrSystem = new HRSystem();

        // Add employees
        Employee employee1 = new Employee("Manoj Kumar", 101, 60000);
        Employee employee2 = new Employee("Jhon", 102, 70000);

        hrSystem.addEmployee(employee1);
        hrSystem.addEmployee(employee2);

        // Display employees
        hrSystem.displayEmployees();
    }
}