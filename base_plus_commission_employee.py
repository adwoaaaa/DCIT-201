from commission_employee import CommissionEmployee

class BasePlusCommissionEmployee(CommissionEmployee):
    def __init__(self, first_name, last_name, social_security_number, gross_sales, commission_rate, base_salary):
        super().__init__(first_name, last_name, social_security_number, gross_sales, commission_rate)
        self.__base_salary = max(0.0, base_salary) 

    # Getter and Setter for base_salary
    @property
    def base_salary(self):
        return self.__base_salary

    @base_salary.setter
    def base_salary(self, new_salary):
        if new_salary >= 0.0:
            self.__base_salary = new_salary
        else:
            raise ValueError("Base salary must be at least 0.0")

    # Overridden earnings method
    def earnings(self):
        return self.base_salary + super().earnings()

    # Overridden display_employee_details method
    def display_employee_details(self):
        return (super().display_employee_details() +
                f"Base Salary: ${self.base_salary:.2f}\n"
                f"Total Earnings: ${self.earnings():.2f}\n")