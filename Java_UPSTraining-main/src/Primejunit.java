import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " - " + salary + " - " + department;
    }

   public String getName(){
        return this.name;
   }
   public double getSalary(){
        return this.salary;
   }
   public String getDepartment(){
        return this.department;
   }
}

public class Primejunit {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Suji", 60000, "HR"),
                new Employee("swea", 75000, "Developer"),
                new Employee("Abi", 75000, "HR"),
                new Employee("muthu", 70000, "Developer")
        ));


        employees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
                        .thenComparing(Employee::getDepartment))
                .collect(Collectors.toList());

        employees.forEach(System.out::println);
    }
}
