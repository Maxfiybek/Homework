package S.O.L.I.D.Liskov_Substitution;

import S.O.L.I.D.Liskov_Substitution.Abilities.SeniorAbility;

import java.util.function.Consumer;

public class Chef implements SeniorAbility {
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
