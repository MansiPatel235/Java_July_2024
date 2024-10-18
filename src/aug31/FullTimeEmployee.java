package aug31;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*2;
    }
}
