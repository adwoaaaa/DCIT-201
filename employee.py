from abc import ABC, abstractmethod

class Employee(ABC):
    def __init__(self, name, employee_id):
        self._name = name
        self._employee_id = employee_id
        

    
    # Getter methods
    @property
    def name(self):
        return self._name

    @property
    def employee_id(self):
        return self._employee_id

    # Abstract method
    @abstractmethod
    def calculate_pay(self):
        pass