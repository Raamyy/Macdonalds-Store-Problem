package Macdonald;

/* This class is the factory class of the Meal classes
    it contains a static function that takes a meal type and a sandwich type
     and returns the meal **BUILDED**.
 */

public class MealMaker {
    public static Meal MakeMeal(MealType m, SandwichType s ) {
        if (m == MealType.Regular)
            return new RegularMeal(s);
        else if(m == MealType.Combo)
            return new ComboMeal(s);
        else if(m == MealType.SuperCombo)
            return new SuperComboMeal(s);
        return null;
    }
}
