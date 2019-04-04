package Macdonald;

import java.util.ArrayList;

/* Every Sandwich has a list of ingredients
   and has function prepare that populates the list with the given ingredients

    Sandwich Types:
    - Cheese Burger
    - Double Cheese Burger
    - Mushroom and Swiss Burger

   */

public abstract class Sandwich extends Item {
    ArrayList<Ingredient> components;

    Sandwich(){
        super();
        components = new ArrayList<>();
        prepare();
    }
    protected final void addComponent(Ingredient i){
        components.add(i);
    }

    // All sandwiches are displayed in this way
    public final void display(){
        System.out.println(this.name+".."+this.getSlogan()+
                            "\n------------------------");
        for(int i=0 ; i<components.size() ; i++){
            components.get(i).display();
        }
        System.out.println("\n------------------------");
    }

    protected abstract String getSlogan(); // This functions gets the sandwich slogan --from MAC website
    protected abstract void prepare(); // Populates the list with the desired ingredients
}
