package Macdonald;

class SuperComboMeal extends Meal {
    public SuperComboMeal(SandwichType s) {
        super(s);
        this.mealName = "Super Combo Meal";
    }

    @Override
    protected void BuildMeal() {
        Components.add(SandwichMaker.PrepareSandwich(this.Stype));
        Components.add(new Fries());
        Components.add(new Soda());
    }
}
