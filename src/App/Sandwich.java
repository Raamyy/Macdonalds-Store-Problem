package App;

import java.util.ArrayList;

public abstract class Sandwich extends Item {
    ArrayList<Ingredient> components;

    Sandwich(){
        super();
        components = new ArrayList<>();
    }
    public final void addComponent(Ingredient i){
        components.add(i);
    }
    public final void display(){
        System.out.println(this.name+"\n------------------------");
        for(int i=0 ; i<components.size() ; i++){
            components.get(i).display();
        }
        System.out.println(this.name+"\n------------------------");
    }
    public abstract void prepare();
}
