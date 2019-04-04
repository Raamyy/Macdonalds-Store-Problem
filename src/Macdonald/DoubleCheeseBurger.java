package Macdonald;

 class DoubleCheeseBurger extends CheeseBurger {
    DoubleCheeseBurger(){
        super();
        this.name = "Double Cheese Burger";
    }
     @Override
     protected String getSlogan() {
         return "Meatier and cheesier.";
     }

    protected void placeBeefAndCheese(){
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
    }
}
