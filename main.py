from commission_employee import CommissionEmployee
from base_plus_commission_employee import BasePlusCommissionEmployee
from full_time_employee import FullTimeEmployee

# Creating an instance of CommissionEmployee
employee = CommissionEmployee("Phillipa", "Antwi-Boasiako", "155-76-9081", 654.5, 0.1)

# Display initial details
print(employee.display_employee_details())

# Updating gross sales and commission rate
employee.gross_sales = 7000
employee.commission_rate = 0.17

# Display updated details
print("Updated " + employee.display_employee_details())


# base plus commission employee
base_plus_commission_employee = BasePlusCommissionEmployee("Jess", "Anaman", "789-01-2231", 3674, 0.08, 1005)
print("Base Plus Commission " + base_plus_commission_employee.display_employee_details())

base_plus_commission_employee.base_salary = 1200
print("Updated Base Plus Commission " + base_plus_commission_employee.display_employee_details())


# Creating an instance of FullTimeEmployee
full_time_emp = FullTimeEmployee("Awura Adwoa Akyere", "EMP001", 10000)

# Displaying employee details
print("Employee Details:")
print(f"Employee Name: {full_time_emp.name}")
print(f"Employee ID: {full_time_emp.employee_id}")
print(full_time_emp.calculate_pay())