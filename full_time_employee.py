from employee import Employee

class FullTimeEmployee(Employee):
    def __init__(self, name, employee_id, salary):
        super().__init__(name, employee_id)
        self._salary = salary

    # Getter method for salary
    @property
    def salary(self):
        return self._salary

    # Implementing abstract method
    def calculate_pay(self):
        return f"FullTimeEmployee Pay: ${self._salary:.2f}"