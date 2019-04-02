package Macdonald;

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
