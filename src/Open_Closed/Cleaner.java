package Open_Closed;

public class Cleaner implements SalaryInterface {
    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 30;
    }
}
