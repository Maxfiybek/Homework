package S.O.L.I.D.Liskov_Substitution1;

import S.O.L.I.D.Liskov_Substitution1.Abilities.JuniorAbility;

import java.util.function.Consumer;

public class Ahmed implements JuniorAbility {
    private final Consumer<String> messager = System.out::println;

    @Override
    public Restaurant canCookKabob() {
        messager.accept("Ahmed kabob pishira oladi !");
        return null;
    }
}
