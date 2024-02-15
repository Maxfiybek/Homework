package Single_Responsibility;

public class MotorService {
    ServiceListener<String> listener = System.out::println;   //Lambda by using my Interface
    public Car fixMotor() {
        listener.accept("Mashina mator tuzatish servisidan foydalanadi !");
        return null;
    }
    public Car changeMotor(){
        listener.accept("Mashina matori yangi qo`yiladi !");
        return null;
    }
}
