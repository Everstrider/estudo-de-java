package List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.printf("Employee #%d: ", i + 1);
            Integer id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            Double salary = sc.nextDouble();
            sc.nextLine();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have the salary increase: ");
        int increase = sc.nextInt();
        Integer position = Employee.hasId(list, increase);
        if (position == null){
            System.out.println("ID does not exist on the list.");
        } else {
            System.out.println("Enter the percentage to increase: ");
            double percentage = sc.nextDouble();
            list.get(position).salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee y : list){
            System.out.println(y);
        }


        sc.close();
    }


}
