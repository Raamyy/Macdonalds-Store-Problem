package Macdonald;

import java.util.ArrayList;

public abstract class Meal{
    String mealName;
    protected SandwichType Stype;
    protected Sandwich Sandwich;
    protected ArrayList<SideItem> SideItems;
    Meal(SandwichType s){
        SideItems = new ArrayList<>();
        this.Stype = s;
        BuildMeal();
    }
    public final void serve(){
        System.out.println("Here is your "+mealName+" !\n===================");
        Sandwich.display();
        System.out.println("Side Items:");
        for (int i=0 ; i<SideItems.size() ; i++)
        {
            SideItems.get(i).display();
        }
    }
    protected abstract void BuildMeal();
}
