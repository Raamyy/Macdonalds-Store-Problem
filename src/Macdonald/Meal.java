package Macdonald;

import java.util.ArrayList;

/*  All the meals consist of 1 Sandwich and multiple side items (Assumed -- questioned not answered)
    Every meal has buildMeal function that populates its data.

    Meal Types:
    - Regular (only Burger)
    - Combo (Burger + Fires)
    - Super Combo (Burger + Fries + Soda )
 */

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
