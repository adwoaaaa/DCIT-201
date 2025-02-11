from staff_member import StaffMember

class Staff(StaffMember):
    def __init__(self, name, staff_id):
        super().__init__(name, staff_id)
        self.staff_list = []  # List to store multiple staff members

    def add_staff(self, staff):
        """Adds a staff member to the list"""
        self.staff_list.append(staff)

    def get_annual_salary(self, monthly_salary):
        """Implements the abstract method to calculate annual salary"""
        return monthly_salary * 12  # Annual Salary = Monthly Salary × 12

    def display_staff(self):
        """Displays staff details"""
        for staff in self.staff_list:
            print(staff)

    def __str__(self):
        return super().__str__()  # Calls the parent __str__ method