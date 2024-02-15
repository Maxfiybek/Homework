package Open_Closed;

public class Teacher implements SalaryInterface{

    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 50;
    }
}
