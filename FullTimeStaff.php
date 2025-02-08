<?php
class FullTimeStaff extends StaffMember{
    private float $monthlySalary;

    public function __construct(string $name, string $id, float $monthlySalary) {
        parent::__construct($name, $id);
        $this->monthlySalary = $monthlySalary;
    }

    public function getMonthlySalary(): float {
        return $this->monthlySalary;
    }

    public function getAnnualSalary(): float {
        return $this->monthlySalary * 12;
    }


    // Overriding the toString method to include salary details
    public function __toString(): string {
        return parent::__toString() . ", Monthly Salary: {$this->monthlySalary}, Annual Salary: {$this->getAnnualSalary()}\n";
    }

}
?> 