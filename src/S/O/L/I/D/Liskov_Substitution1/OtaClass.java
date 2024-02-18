package S.O.L.I.D.Liskov_Substitution1;

import S.O.L.I.D.Liskov_Substitution1.Abilities.Parent_Ability;

import java.util.function.Consumer;

public class OtaClass implements Parent_Ability {  //Chefni sub clasi
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookManti() {
        messager.accept("OtaClass manti pishira oladi !");
        return null;
    }

    @Override
    public Restaurant canCookKabob() {
        messager.accept("OtaClass kabob ham pishira oladi !");
        return null;
    }
}
