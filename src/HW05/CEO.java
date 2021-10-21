package HW05;

public class CEO extends Employee{
    private double bonusIncome;

    public CEO(double salary, double bonusIncome) {
        super(salary);
        this.bonusIncome = bonusIncome;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonusIncome;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    public double getBonusIncome() {
        return bonusIncome;
    }

    public void setBonusIncome(double bonusIncome) {
        this.bonusIncome = bonusIncome;
    }
}
