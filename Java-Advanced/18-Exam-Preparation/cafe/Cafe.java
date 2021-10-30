package cafe;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        if (this.employees.size() < this.capacity){
            this.employees.add(employee);
        }
    }

    public boolean remove(String name){
        int sizeBeforeRemove = employees.size();

        employees.removeIf(empl -> empl.getName().equals(name));
        return sizeBeforeRemove != employees.size();
    }

    public Employee getOldestEmployee(){
        return this.employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
    }

    public Employee getEmployee(String name){
        for (Employee employee : employees) {
            if(employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

    public int getCount(){
        return  employees.size();
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append("Employees working at Cafe ")
                .append(this.name).append(":")
                .append(System.lineSeparator());
        employees.forEach(employee -> builder.append(employee).append(System.lineSeparator()));


        return builder.toString();
    }
}
