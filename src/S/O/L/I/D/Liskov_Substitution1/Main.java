package S.O.L.I.D.Liskov_Substitution1;

public class Main {
    public static void main(String[] args) {
        //S.O.L.I.D
        //Liskov Substitution = Substitution o`rnini olish o`rniga ishlatish degan ma`nolarni beradi inglizchada
        //Ya`ni Liskov Substitution da Ota qila olgan narsani bola ham qila olishi kerak aks holda Likov Substitution qoidasiga zid bo`lib qoladi !
        //Child clas o`zi metod taqdim etsa ham etmasa ham bo`laveradi lekin o`zi Ota clasdan kelgan metodlarni o`zlashtirishi shart hisoblanadi !

        Restaurant restaurant = new Subclass().canCookPalov();
        Restaurant restaurant1 = new Subclass().canCookKabob();
        Restaurant restaurant2 = new Subclass().canCookManti();
        System.out.println("-------------------------------");
        Restaurant restaurant4 = new OtaClass().canCookManti();
        Restaurant restaurant5 = new OtaClass().canCookKabob();
        System.out.println("-------------------------------");
        Restaurant restaurant6 = new BoboClass().canCookKabob();
    }
}
