package S.O.L.I.D.Liskov_Substitution2;

import S.O.L.I.D.Liskov_Substitution2.Persons.Alex;
import S.O.L.I.D.Liskov_Substitution2.Persons.Anna;
import S.O.L.I.D.Liskov_Substitution2.Persons.John;

public class Main {
    public static void main(String[] args) {

        //Liskov Substitution = Substitution o`rnini olish o`rniga ishlatish degan ma`nolarni beradi inglizchada
        //Ya`ni Liskov Substitution da Ota qila olgan narsani bola ham qila olishi kerak aks holda Likov Substitution qoidasiga zid bo`lib qoladi !

        Consert consert1 = new Alex().canPlayGuitar(); //Alex Bobo !
        System.out.println("-------------------------------");
        Consert consert = new John().canPlayPiano();  //John Alex ni sub clasi !
        Consert consert5 = new John().canPlayGuitar();
        System.out.println("-------------------------------");
        Consert consert2 = new Anna().canPlayGuitar(); //Anna Alex ni nevarasi Johnni sub clasi !
        Consert consert3 = new Anna().canSinSong();
        Consert consert4 = new Anna().canPlayPiano();
    }
}
