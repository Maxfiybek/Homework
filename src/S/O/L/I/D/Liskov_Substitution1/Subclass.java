package S.O.L.I.D.Liskov_Substitution1;

import S.O.L.I.D.Liskov_Substitution1.Abilities.Child_Ability;

import java.util.function.Consumer;

public class Subclass implements Child_Ability {
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookPalov() {
        messager.accept("Subclass palov pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookManti() {
        messager.accept("Subclass manti pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookKabob() {
        messager.accept("Subclass kabob pishia oladi !");
        return null;
    }
}
