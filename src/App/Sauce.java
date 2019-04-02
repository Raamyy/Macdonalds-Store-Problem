package App;

public class Sauce extends Ingredient {
    Sauce() {
        super();
    }

    @Override
    public final void display(){
        System.out.println(this.name + "(Sauce)");
    }
}
