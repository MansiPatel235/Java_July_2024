package aug31;

public class MainEmployee {
    public static void main(String[] args) {
        FullTimeEmployee ft=new FullTimeEmployee(101,"Mansi",2000);
        double salary=ft.getSalary();
        System.out.println("Salary of the employee :"+salary);

        double bonus= ft.calculateBonus();
        System.out.println("Bonus for ft Employee : "+bonus);

        PartTimeEmployee pt=new PartTimeEmployee(102,"Rakesh",200);
        double ptBonus=pt.calculateBonus();
        System.out.println("Part time Employee bonus : "+ptBonus);
    }
}
