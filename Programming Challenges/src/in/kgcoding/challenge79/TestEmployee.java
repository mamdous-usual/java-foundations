package in.kgcoding.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee newEmployee = new Employee("Mamdous", 23, 150000);
        System.out.println(newEmployee.getEmployeeDetails());
        newEmployee.setAge(24);
        newEmployee.setName("Mamdous Laskar");
        System.out.println(newEmployee.getEmployeeDetails());
    }
}
