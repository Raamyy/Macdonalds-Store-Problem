package Macdonald;

class RegularMeal extends Meal{

    public RegularMeal(SandwichType s) {
        super(s);
        this.mealName = "Regular Meal";
    }

    @Override
    protected void BuildMeal() {
        Components.add(SandwichMaker.PrepareSandwich(this.Stype));
    }
}
