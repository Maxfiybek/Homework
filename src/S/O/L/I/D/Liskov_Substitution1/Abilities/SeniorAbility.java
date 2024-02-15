package S.O.L.I.D.Liskov_Substitution1.Abilities;

import S.O.L.I.D.Liskov_Substitution1.Restaurant;

public interface SeniorAbility extends MiddleAbility, JuniorAbility {
    Restaurant canCookPalov();
}
