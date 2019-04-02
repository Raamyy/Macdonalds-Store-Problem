package Macdonald;

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
