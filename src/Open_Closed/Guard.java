package Open_Closed;

public class Guard implements SalaryInterface{
    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 40;
    }
}
