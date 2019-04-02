package App;

 class ComboMeal extends Meal{
    public ComboMeal(SandwichType s) {
        super(s);
        this.mealName = "Combo Meal";
    }

    @Override
    protected void BuildMeal() {
        Components.add(SandwichMaker.PrepareSandwich(this.Stype));
        Components.add(new Fries());
    }
}
