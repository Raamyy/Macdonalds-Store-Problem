import App.*;
public class Main {

    public static void main(String[] args) {
        Sandwich s = SandwichMaker.PrepareSandwich(SandwichType.MushroomAndSwissburger);
        s.display();

        Meal m = MealMaker.MakeMeal(MealType.Regular, SandwichType.DoubleCheeseBurger);
        m.serve();
    }
}
