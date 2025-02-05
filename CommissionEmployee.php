<?php

class CommissionEmployee {
   private string $firstName;
   private string $lastName;
   private string $socialSecurityNumber;
   private float $grossSales;
   private float $commissionRate;


public function __construct(string $firstName, string $lastName, string $socialSecurityNumber, float $grossSales, float $commissionRate) {
   $this->firstName = $firstName;
   $this->lastName = $lastName;
   $this->socialSecurityNumber = $socialSecurityNumber;
   $this->setGrossSales($grossSales);
   $this->setCommissionRate($commissionRate);
}

public function getFirstName(): string {
   return $this->firstName;
}

public function setFirstName(string $firstName): void {
   $this->firstName = $firstName;
}

public function getLastName(): string{
   return $this->lastName;
}

public function setLastName(string $lastName): void{
   $this->lastName = $lastName;
}

public function getSocialSecurityNumber(): string{
   return $this->socialSecurityNumber;
}

public function getGrossSales(): float{
   return $this->grossSales;
}

public function setGrossSales(float $grossSales): void{
   if ($grossSales < 0.0){
      throw new InvalidArgumentException("Gross sales must be greater or equal to 0.0");
   }else{
      $this->grossSales = $grossSales;
   }
}

public function getCommissionRate(): float{
   return $this->commissionRate;
}

public function setCommissionRate(float $commissionRate): void{
   if ($commissionRate < 0.0 || $commissionRate > 1.0){
      throw new InvalidArgumentException("Commission rate must be between 0.00 and 1.0");
   }else{
      $this->commissionRate = $commissionRate;
   }
}

public function earnings(): float{
   return $this->grossSales * $this->commissionRate;
}

public function displayEmployeeDetails(): void{
   echo "Employee Name: {$this->firstName} {$this->lastName}\n";
   echo "Social Security Number: {$this->socialSecurityNumber}\n";
   echo "Gross Sales: \${$this->grossSales}\n";
   echo "Commission Rate: {$this->commissionRate}\n";
   echo "Earnings: \${$this->earnings()}\n";
}
}

?>