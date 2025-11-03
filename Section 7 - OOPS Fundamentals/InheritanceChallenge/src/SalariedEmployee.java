public class SalariedEmployee extends Employee{

    double annualSalary;
    boolean isRetired = false;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.6 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retire() {
        isRetired = true;
        terminate("01/10/2025");
    }
}
