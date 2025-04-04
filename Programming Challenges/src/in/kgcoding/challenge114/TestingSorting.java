package in.kgcoding.challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Mamdous",1000),
                new Employee("Pooran",10000),
                new Employee("Sanchit",10000),
                new Employee("Prashant",15000)
                );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
