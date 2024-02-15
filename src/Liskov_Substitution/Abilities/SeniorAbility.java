package Liskov_Substitution.Abilities;

import Liskov_Substitution.Restaurant;

public interface SeniorAbility extends MiddleAbility, JuniorAbility {
    Restaurant canCookPalov();
}
