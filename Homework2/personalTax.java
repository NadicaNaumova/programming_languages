public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        
        String employeeName = "John Doe";
        double grossSalary = 50000.0; 

       
        double stateTaxRate = 0.284;
        double stateTaxes = grossSalary * stateTaxRate;

       
        double personalTax = 0.0;

        double taxableIncome = grossSalary - stateTaxes - 7000;
        if (taxableIncome > 0) {
            double personalTaxRate = 0.10;
            personalTax = taxableIncome * personalTaxRate;
        }

       
        double netSalary = grossSalary - stateTaxes - personalTax;

        
        stateTaxes = Math.round(stateTaxes);
        personalTax = Math.round(personalTax);
        netSalary = Math.round(netSalary);

        
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("State Taxes: $" + stateTaxes);
        System.out.println("Personal Tax: $" + personalTax);
        System.out.println("Net Salary: $" + netSalary);
    }
}
