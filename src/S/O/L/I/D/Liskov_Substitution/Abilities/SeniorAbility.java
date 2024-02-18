package S.O.L.I.D.Liskov_Substitution.Abilities;

import S.O.L.I.D.Liskov_Substitution.Restaurant;

public interface SeniorAbility extends MiddleAbility, JuniorAbility {
    Restaurant canCookPalov();
}
