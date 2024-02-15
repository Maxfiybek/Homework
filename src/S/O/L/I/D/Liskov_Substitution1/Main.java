package S.O.L.I.D.Liskov_Substitution1;

public class Main {
    public static void main(String[] args) {
        //S.O.L.I.D
        //Liskov Substitution = Substitution o`rnini olish o`rniga ishlatish degan ma`nolarni beradi inglizchada
        //Ya`ni Liskov Substitution da Ota qila olgan narsani bola ham qila olishi kerak aks holda Likov Substitution qoidasiga zid bo`lib qoladi !

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
