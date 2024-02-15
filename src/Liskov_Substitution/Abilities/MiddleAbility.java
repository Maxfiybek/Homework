package Liskov_Substitution.Abilities;

import Liskov_Substitution.Restaurant;

public interface MiddleAbility extends JuniorAbility {
    Restaurant canCookManti();
}
