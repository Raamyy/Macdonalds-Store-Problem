package App;

 abstract class Bread extends Ingredient {
    Bread() {
        super();
    }

    @Override
    public final void display(){
        System.out.println(this.name + "(BREAD)");
    }
}
