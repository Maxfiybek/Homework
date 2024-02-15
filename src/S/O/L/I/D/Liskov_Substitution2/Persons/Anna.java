package S.O.L.I.D.Liskov_Substitution2.Persons;

import S.O.L.I.D.Liskov_Substitution2.Consert;

public class Anna extends John{

    public Consert canSinSong() {
        System.out.println("Anna Qo`shiq ayta oladi !");
        return null;
    }

    @Override
    public Consert canPlayGuitar() {
        System.out.println("Anna Gitara ham chala oladi !");
        return null;
    }

    @Override
    public Consert canPlayPiano() {
        System.out.println("Anna Pianina ham chal oladi !");
        return null;
    }

}
