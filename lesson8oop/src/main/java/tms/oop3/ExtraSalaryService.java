package tms.oop3;

public class ExtraSalaryService extends SalaryService {

    @Override
    public int calcSalary(Employee employee) {
        return super.calcSalary(employee) + employee.getProf().getExtra();
    }

}
