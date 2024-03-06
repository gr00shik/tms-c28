package tms.oop3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("vova", Prof.DIRECTOR, 3);
        Employee employee2 = new Employee("olya", Prof.WORKER, 20);

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        SalaryService salaryService = new SalaryService();
        int sal1 = salaryService.calcSalary(employee1);
        int sal2 = salaryService.calcSalary(employee2);

        System.out.println(employee1.getName() + " has salary = " + sal1);
        System.out.println(employee2.getName() + " has salary = " + sal2);

    }
}
