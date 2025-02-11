from staff import Staff

# Create staff instances
staff1 = Staff("Awura Adwoa Akyere", "STAFF001")

# Add staff members
organization = Staff("Organization", "ORG001")  # A container for managing staff
organization.add_staff(staff1)

# Display Staff Details
print("Staff Details:")
organization.display_staff()

# Calculate and display annual salary
monthly_salary1 = 5000  


print("\nDisplay Annual Salary:")
print(f"{staff1.name} - Annual Salary: ${staff1.get_annual_salary(monthly_salary1):,.2f}")
