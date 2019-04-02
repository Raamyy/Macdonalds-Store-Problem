package App;

import java.util.ArrayList;

public abstract class Meal{
    String mealName;
    protected SandwichType Stype;
    protected ArrayList<Item> Components;
    Meal(SandwichType s){
        Components = new ArrayList<>();
        this.Stype = s;
        BuildMeal();
    }
    public final void serve(){
        System.out.println("Here is your "+mealName+" !\n===================");
        for (int i=0 ; i<Components.size() ; i++)
        {
            Components.get(i).display();
        }
    }
    protected abstract void BuildMeal();

}
