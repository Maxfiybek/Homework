package Liskov_Substitution;

import Liskov_Substitution.Abilities.JuniorAbility;

import java.util.function.Consumer;

public class Ahmed implements JuniorAbility {
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookKabob() {
        messager.accept("BoboClass kabob pishira oladi !");
        return null;
    }
}
