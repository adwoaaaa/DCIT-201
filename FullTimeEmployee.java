public class FullTimeEmployee extends Employee{
    private double salary;

    public FullTimeEmployee(String name, String employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
}

    public double getSalary() {
     return salary; 
    }

    @Override
    public void calculatePay() {
        System.out.printf("FullTimeEmployee Pay: %.2f%n", salary);
    }
}