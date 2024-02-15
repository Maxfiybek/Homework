package S.O.L.I.D.Single_Responsibility1;

public class CleanerService {
    ServiceListener<String> listener = System.out::println;
    public Car carWash(){
        listener.accept("Mashina moyka servisidan foydalanadi !");
        return null;
    }
    public Car washInnerCar(){
        listener.accept("Mashina salon qismi bian tzalanadi !");
        return null;
    }
}
