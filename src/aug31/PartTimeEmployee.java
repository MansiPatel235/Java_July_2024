package aug31;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.1;
    }
}
