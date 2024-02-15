package S.O.L.I.D.Liskov_Substitution1;

import S.O.L.I.D.Liskov_Substitution1.Abilities.MiddleAbility;

import java.util.function.Consumer;

public class Abuzar implements MiddleAbility {  //Chefni sub clasi
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookManti() {
        messager.accept("Abuzar manti pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookKabob() {
        messager.accept("Abuzar kabob ham pishira oladi !");
        return null;
    }
}