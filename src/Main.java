import Macdonald.*;

public class Main {

    public static void main(String[] args) {

        Meal meal1 = MealMaker.MakeMeal(MealType.Regular, SandwichType.DoubleCheeseBurger);
        meal1.serve();

        Meal meal2 = MealMaker.MakeMeal(MealType.Combo, SandwichType.MushroomAndSwissburger);
        meal2.serve();

        Meal meal3 = MealMaker.MakeMeal(MealType.SuperCombo, SandwichType.CheeseBurger);
        meal3.serve();

        Sandwich order1 = SandwichMaker.PrepareSandwich(SandwichType.DoubleCheeseBurger);
        order1.display();

    }
}
