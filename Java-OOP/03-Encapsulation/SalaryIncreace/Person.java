package SalaryIncreace;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0.0);
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void increaseSalary(double increment){
        if (age < 30){
            increment = increment / 2;
        }
        this.salary = this.salary * (1.00 + increment / 100);
    }


        public void setSalary(double salary) {
        this.salary = salary;
    }
}
