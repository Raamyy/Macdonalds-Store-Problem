package Macdonald;

/* This class is the factory class of the Sandwiches classes
    it contains a static function that takes a sandwich type and returns the Burger **PREPARED**
 */

 public  class SandwichMaker {
    public static Sandwich PrepareSandwich(SandwichType s){
        if(s == SandwichType.CheeseBurger)
            return new CheeseBurger();
        else if(s == SandwichType.DoubleCheeseBurger)
            return new DoubleCheeseBurger();
        else if(s == SandwichType.MushroomAndSwissburger)
            return new MushromAndSwissBurger();
        return null;
    }
}
