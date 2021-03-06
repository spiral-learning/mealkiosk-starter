package com.welltestedlearning.mealkiosk;

/**
 * A pre-defined meal that has a fixed price
 */
public class SpecialMealOrder extends MealOrder {

    public SpecialMealOrder() {
        addBurger(BurgerOption.CHEESEBURGER);
        addDrink(Drink.DRINK_LARGE);
        addFries(Fries.LARGE);
    }

    @Override
    public int price() {
        return 9;
    }
}
