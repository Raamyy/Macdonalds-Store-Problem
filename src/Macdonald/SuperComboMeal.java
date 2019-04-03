package Macdonald;

class SuperComboMeal extends Meal {
    public SuperComboMeal(SandwichType s) {
        super(s);
        this.mealName = "Super Combo Meal";
    }

    @Override
    protected void BuildMeal() {
        Sandwich = SandwichMaker.PrepareSandwich(this.Stype);
        SideItems.add(new Fries());
        SideItems.add(new Soda());
    }
}
