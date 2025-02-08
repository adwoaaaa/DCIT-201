<?php

class Staff {
    private array $staffMembers = [];

    // Method to add a staff member
    public function addStaff(StaffMember $staff): void {
        $this->staffMembers[] = $staff;
    }

    // Method to display all staff details
    public function displayStaff(): void {
        foreach ($this->staffMembers as $staff) {
            echo $staff . "\n";
        }
    }

    public function calculateTotalAnnualSalary(): float {
        $total = 0.0;
        foreach ($this->staffMembers as $staff) {
            $total += $staff->getAnnualSalary();
        }
        return $total;
    }
}
?>