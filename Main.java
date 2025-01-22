public class Main {
    public static void main(String[] args) {
        try {
            // Create a CommissionEmployee object
            CommissionEmployee employee = new CommissionEmployee("Seth", "Simons", "123-45-6789", 5000.0, 0.2);
            System.out.println("Employee details:");
            System.out.println(employee);

            // Update grossSales and commissionRate
            System.out.println("\nUpdating employee's gross sales and commission rate.");
            employee.setGrossSales(7000.0);
            employee.setCommissionRate(0.25);
            System.out.println("Updated employee details:");
            System.out.println(employee);

            // Calculate and display earnings
            System.out.printf("%nEarnings: %.2f%n", employee.earnings());

            // Test validations
            System.out.println("\nTesting validations.");
            try {
                employee.setGrossSales(-1000.0); // Invalid gross sales
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                employee.setCommissionRate(1.5); // Invalid commission rate
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}