package S.O.L.I.D.Open_Closed1;

public class Teacher implements SalaryInterface{

    @Override
    public int getSalary(int workDaysNumber) {
        return workDaysNumber * 50;
    }
}
