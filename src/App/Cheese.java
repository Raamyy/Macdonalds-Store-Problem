package App;

public class Cheese extends Ingredient {
    Cheese() {
        super();
    }

    @Override
    public final void display(){
        System.out.println(this.name + "(CHEESE)");
    }
}
