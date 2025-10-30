public class SalariedEmployee extends Employee{

    protected double annualSalary;
    protected boolean isRetired = false;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        isRetired = true;
        System.out.println( " is retired");
    }
}
