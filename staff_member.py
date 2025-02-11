from abc import ABC, abstractmethod

class StaffMember(ABC):
    def __init__(self, name, staff_id):
        self._name = name
        self._id = staff_id

    @property
    def name(self):
        return self._name

    @property
    def staff_id(self):
        return self._id

    @abstractmethod
    def get_annual_salary(self, monthly_salary):
        """Abstract method to calculate annual salary"""
        pass

    def __str__(self):
        return f"Staff Name: {self._name}, Staff ID: {self._id}"