package Macdonald;

 abstract class Ingredient extends Item {
    Ingredient(){
        super();
    }

    public void display(){
        System.out.println(this.name);
    }
}
