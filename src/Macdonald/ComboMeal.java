package Macdonald;

 class ComboMeal extends Meal{
    public ComboMeal(SandwichType s) {
        super(s);
        this.mealName = "Combo Meal";
    }

    @Override
    protected void BuildMeal() {
        Sandwich= SandwichMaker.PrepareSandwich(this.Stype);
        SideItems.add(new Fries());
    }
}
