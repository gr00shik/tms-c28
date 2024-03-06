package tms.oop3;

public class SalaryService {

    public int calcSalary(Employee employee) {
        int koef = employee.getProf().getKoef();

        int age = employee.getAge();

        return 1000 + koef * 100 * age;
    }

}
