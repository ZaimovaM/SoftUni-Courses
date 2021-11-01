package ValidaitionData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    private void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void setFirstName(String firstName) {
        ensureName(firstName, "First");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        ensureName(lastName, "Last");
        this.lastName = lastName;
    }

    public void ensureName(String name, String massagePrefix){
        if (name.length() < 3){
            throw new IllegalArgumentException(massagePrefix + " name cannot be less than 3 symbols");
        }
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0.0);
    }


    public void increaseSalary(double increment){
        if (age < 30){
            increment = increment / 2;
        }
        this.salary = this.salary * (1.00 + increment / 100);
    }


        public void setSalary(double salary) {
        if(salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.firstName, this.lastName, this.age);
    }
}
