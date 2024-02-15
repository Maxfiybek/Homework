package S.O.L.I.D.Single_Responsibility1;

public class Main {
    public static void main(String[] args) {
        //S.O.L.I.D

        //S = Single Responsibility
        //Single Responsibility = bunda faqat bitta klaslar o`ziga tegishli bo`lgan ma`sulyatlarni bajarishi kerak bo`ladi !

        OilService oilService = new OilService();
        MotorService motorService = new MotorService();
        Car car = oilService.oilChange();
        Car car1 = motorService.fixMotor();
    }
}