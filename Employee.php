<?php
abstract class Employee{
    private string $name;
    private String $employeeId;

    public function __construct(string $name, string $employeeId) {
        $this->name = $name;
        $this->employeeId = $employeeId;
    }

    public function getName():string { 
        return $this->name; 
    }

    public function getEmployeeId(): string {
        return $this->employeeId;
    }

    abstract public function calculatePay(): string;

}

?>