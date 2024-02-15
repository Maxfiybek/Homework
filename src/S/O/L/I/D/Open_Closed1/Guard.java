package S.O.L.I.D.Open_Closed1;

public class Guard implements SalaryInterface{
    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 40;
    }
}
