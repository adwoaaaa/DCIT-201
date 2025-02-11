class CommissionEmployee:
    def __init__(self, first_name, last_name, social_security_number, gross_sales, commission_rate):
        self.first_name = first_name
        self.last_name = last_name
        self.__social_security_number = social_security_number
        self.__gross_sales = max(0.0, gross_sales)
        self.__commission_rate = self.__validate_commission_rate(commission_rate)


 # Getter and Setter for gross_sales
    @property
    def gross_sales(self):
        return self.__gross_sales
    
    @gross_sales.setter
    def gross_sales(self, value):
        if value >= 0.0:
            self.__gross_sales = value
        else:
            raise ValueError("Gross sales must be at least 0.0")


# Getter and Setter for commission_rate
    @property
    def commission_rate(self):
        return self.__commission_rate
    
    @commission_rate.setter
    def commission_rate(self, value):
        self.__commission_rate = self.__validate_commission_rate(value)
    
    # Private method to validate commission rate
    def __validate_commission_rate(self, rate):
        if 0.0 <= rate <= 1.0:
            return rate
        else:
            raise ValueError("Commission rate must be between 0.0 and 1.0")
    
    # Method to calculate earnings
    def earnings(self):
        return self.__gross_sales * self.__commission_rate
    
     # Method to display employee details
    def display_employee_details(self):
        return (f"Employee Details:\n"
                f"Employee Name: {self.first_name} {self.last_name}\n"
                f"Social Security Number: {self.__social_security_number}\n"
                f"Gross Sales: ${self.__gross_sales:.1f}\n"
                f"Commission Rate: {self.__commission_rate:.2f}\n"
                f"Earnings: ${self.earnings():.2f}\n")


