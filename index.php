<?php
include "CommissionEmployee.php";
include "BasePlusCommissionEmployee.php";
include "FullTimeEmployee.php";
include "StaffMember.php";
include "FullTimeStaff.php";
include "Staff.php";

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

$employee3 = new FullTimeEmployee("Kofi Edu", "FTE273", 690.50);

echo "\n\nFull Time Employee Details:\n";
$employee3->displaydetails();
echo $employee3->calculatePay() . "\n";



$staff1 = new FullTimeStaff("Ava Ofori", "FTS001", 5050.00);

$staffManagement = new Staff();
$staffManagement->addStaff($staff1);

echo"\n\nStaff Details:\n";
$staffManagement->displayStaff();

$totalAnnualSalary = $staffManagement->calculateTotalAnnualSalary();
echo "Total Annual Salary of All Staff: {$totalAnnualSalary}\n";
?>