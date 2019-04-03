package Macdonald;

import java.util.ArrayList;

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
    public final void display(){
        System.out.println(this.name+".."+this.getSlogan()+"\n------------------------");
        for(int i=0 ; i<components.size() ; i++){
            components.get(i).display();
        }
        System.out.println("\n------------------------");
    }
    protected abstract String getSlogan();
    protected abstract void prepare();
}
