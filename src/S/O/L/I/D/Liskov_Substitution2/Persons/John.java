package S.O.L.I.D.Liskov_Substitution2.Persons;

import S.O.L.I.D.Liskov_Substitution2.Consert;

public class John extends Alex{
    @Override
    public Consert canPlayGuitar() {
        System.out.println("John Gitara ham chala oladi !");
        return null;
    }

    public Consert canPlayPiano() {
        System.out.println("John Pianina chala oladi !");
        return null;
    }
}
