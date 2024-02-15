package S.O.L.I.D.Single_Responsibility1;

public class OilService {
    ServiceListener<String> listener = System.out::println;
    public Car oilChange(){
        listener.accept("Mashina mator servisidan foydalanadi !");
        return null;
    }
    public Car Fuel(){
        listener.accept("Mashinaga yoqilg`i kuyiladi !");
        return null;
    }
}
