<?php
include "CommissionEmployee.php";
include "BasePlusCommissionEmployee.php";

$employee1 = new CommissionEmployee("Phillipa", "Antwi-Boasiako", "155-76-9081", 654.50, 0.1);
echo "Employee Details:\n";
$employee1->displayEmployeeDetails();

//updating Gross sales and Commission rate
$employee1->setGrossSales(7000.0);
$employee1->setCommissionRate(0.17);

echo "\n\nUpdated Employee Details:\n";
$employee1->displayEmployeeDetails();


$employee2 = new BasePlusCommiSsionEmployee("Jess", "Anaman", "789-01-2231", 3674, 0.08, 1005);
echo "\n\nBase Plus Commission Employee Details:\n";
$employee2->displayEmployeeDetails();

$employee2->setBaseSalary(1255.5);
echo "\n\nDetails After Base Salary Update:\n";
$employee2->displayEmployeeDetails();
?>