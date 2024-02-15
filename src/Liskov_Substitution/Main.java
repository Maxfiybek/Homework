package Liskov_Substitution;

public class Main {
    public static void main(String[] args) {

        //S.O.L.I.D
        //L = Liskov Substitutionga misol

        Restaurant restaurant = new Chef().canCookPalov();
        Restaurant restaurant1 = new Chef().canCookKabob();
        Restaurant restaurant2 = new Chef().canCookManti();
        System.out.println("-------------------------------");
        Restaurant restaurant4 = new Abuzar().canCookManti();
        Restaurant restaurant5 = new Abuzar().canCookKabob();
        System.out.println("-------------------------------");
        Restaurant restaurant6 = new Ahmed().canCookKabob();
    }
}
