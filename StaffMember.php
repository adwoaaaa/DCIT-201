<?php
abstract class StaffMember{
    private string $name;
    private string $id;

    public function __construct(string $name, string $id) {
        $this->name = $name;
        $this->id = $id;
    }

    public function getName(): string {
        return $this->name;
    }

    public function getId(): string {
        return $this->id;
    }

    abstract public function getAnnualSalary(): float;

    // Method to return staff details
    public function __toString(): string {
        return "Name: {$this->name}, ID: {$this->id}";
    }

}

?>