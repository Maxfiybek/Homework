package S.O.L.I.D.Liskov_Substitution1;

import S.O.L.I.D.Liskov_Substitution1.Abilities.Bobo_Ability;

import java.util.function.Consumer;

public class BoboClass implements Bobo_Ability {
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookKabob() {
        messager.accept("BoboClass kabob pishira oladi !");
        return null;
    }
}
