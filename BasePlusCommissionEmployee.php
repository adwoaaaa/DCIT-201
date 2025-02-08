<?php
class BasePlusCommissionEmployee extends CommissionEmployee{
    private float $baseSalary;

    public function __construct(string $firstName, string $lastName, string $socialSecurityNumber, float $grossSales, float $commissionRate, float $baseSalary){
        parent::__construct( $firstName, $lastName, $socialSecurityNumber, $grossSales, $commissionRate);
        $this->setBaseSalary($baseSalary);
    }

    public function getBaseSalary(): float{
        return $this->baseSalary;
    }

    public function setBaseSalary(float $newSalary): void{
        if ($newSalary <= 0.0){
            throw new InvalidArgumentException ("Base salary must be greater than 0.oo");
        }else{
            $this->baseSalary = $newSalary;
        }
    }

    public function earnings(): float {
        return $this->baseSalary + parent::earnings();
    }

    public function displayEmployeeDetails(): void {
        parent::displayEmployeeDetails();
        echo "Base Salary: {$this->baseSalary}\n";
       // echo "Total Earnings: {$this->earnings()}\n";
       
    }
}
?>