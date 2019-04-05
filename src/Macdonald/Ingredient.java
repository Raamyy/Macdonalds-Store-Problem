package Macdonald;

/* This class is the base  class of all the sandwich ingredients */

 abstract class Ingredient extends Item {
    Ingredient(){
        super();
    }

    public void display(){
        System.out.println(this.name);
    }
}
