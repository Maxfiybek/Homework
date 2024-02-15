package S.O.L.I.D.Open_Closed1;

public class Cleaner implements SalaryInterface {
    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 30;
    }
}
