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
          //  System.out.println("Earnings: " + employee.earnings());


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


            try {
                // Create a BasePlusCommissionEmployee object
                BasePlusCommissionEmployee BPCEmployee = new BasePlusCommissionEmployee("Jane", "Smith", "987-65-4321", 6000, 0.12, 1000);
                System.out.println(BPCEmployee);

                // Update base salary and inherited fields
            BPCEmployee.setBaseSalary(1500);
            BPCEmployee.setGrossSales(8000);
            BPCEmployee.setCommissionRate(0.14);
            System.out.println("Updated Employee Details:\n" + BPCEmployee);

            // Test invalid values
            BPCEmployee.setBaseSalary(-200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a FullTimeEmployee object
            FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", "FT123", 4000);
            System.out.println("Employee Name: " + fullTimeEmp.getName());
            System.out.println("Employee ID: " + fullTimeEmp.getEmployeeId());
            fullTimeEmp.calculatePay();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }


    }
}