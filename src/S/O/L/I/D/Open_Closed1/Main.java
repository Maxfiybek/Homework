package S.O.L.I.D.Open_Closed1;

public class Main {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println("Teacher: " + salaryManager.getSalary(new Teacher(), 20) + "$");
        System.out.println("Cleaner: " + salaryManager.getSalary(new Cleaner(), 20) + "$");
        System.out.println("Guard: " + salaryManager.getSalary(new Guard(), 20) + "$");
    }
}
