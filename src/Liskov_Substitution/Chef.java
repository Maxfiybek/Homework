package Liskov_Substitution;

import Liskov_Substitution.Abilities.SeniorAbility;

import java.util.function.Consumer;

public class Chef implements SeniorAbility {
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookPalov() {
        messager.accept("Chef palov pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookManti() {
        messager.accept("Chef manti pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookKabob() {
        messager.accept("Chef kabob pishia oladi !");
        return null;
    }
}
