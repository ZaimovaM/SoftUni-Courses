package cafe;

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe("Costa", 15);
        Employee employee = new Employee("Alexander", 30, "Bulgaria");

        System.out.println(employee);
        cafe.addEmployee(employee);
        System.out.println(cafe.remove("Employee"));

        Employee secondEmployee = new Employee("Sara", 24, "UK");
        Employee thirdEmployee = new Employee("Anna", 22, "Germany");

        cafe.addEmployee(secondEmployee);
        cafe.addEmployee(thirdEmployee);

        Employee oldestEmployee = cafe.getOldestEmployee();
        Employee employeeStephen = cafe.getEmployee("Sara");
        System.out.println(oldestEmployee);
        System.out.println(cafe.getCount());
        System.out.println(cafe.remove("Anna"));

        System.out.println(cafe.report());


    }
}
