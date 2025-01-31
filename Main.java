public class Main {
    public static void main(String[] args) {
        try {
            // Create a CommissionEmployee object
            CommissionEmployee employee = new CommissionEmployee("Seth", "Simons", "123-45-6789", 5000.0, 0.2);
            System.out.println("EMPLOYEE DETAILS:");
            System.out.println(employee);

            // Update grossSales and commissionRate
            System.out.println("\nUPDATING EMPLOYEE'S GROSS SALES AND COMMISSION RATE.");
            employee.setGrossSales(7000.0);
            employee.setCommissionRate(0.25);
            System.out.println("UPDATED EMPLOYEE DETAILS:");
            System.out.println(employee);
            // Calculate and display earnings
            System.out.printf("%nEarnings: %.2f%n", employee.earnings());

            // Test validations
            System.out.println("\nTESTING EMPLOYEE VALIDATIONS.");
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
                BasePlusCommissionEmployee BPCEmployee = new BasePlusCommissionEmployee("Desiree", "Forson", "739-17-9301", 6000, 0.12, 1000);
                System.out.println("\nBASE PLUS COMMISSION EMPLOYEE DETAILS: ");
                System.out.println(BPCEmployee);
                // Update base salary and inherited fields
            BPCEmployee.setBaseSalary(1500);
            BPCEmployee.setGrossSales(8000);
            BPCEmployee.setCommissionRate(0.14);
            System.out.println("\nUPDATED BASE PLUS COMMISSION EMPLOYEE DETAILS:\n" + BPCEmployee);

            // Test invalid values
             System.out.println("\nTESTING BPC-EMPLOYEE VALIDATIONS:");
            BPCEmployee.setBaseSalary(-200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a FullTimeEmployee object
            FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", "FT123", 4000);
            System.out.println("\nFULL TIME EMPLOYEE DETAILS: ");
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