package Macdonald;

 class CheeseBurger extends Sandwich {
    CheeseBurger(){
        this.name = "Cheese Burger";
    }

     @Override
     protected String getSlogan() {
         return "The cheesy original.";
     }

     protected final void prepare(){
        this.addComponent(new LowerRegularBun());
        this.placeBeefAndCheese();
        this.addComponent(new Ketchup());
        this.addComponent(new PickleSlices());
        this.addComponent(new Onions());
        this.addComponent(new UpperRegularBun());
    }

    /* This uses the template pattern as it is overridden in the double cheese burger class */
     protected void placeBeefAndCheese(){
         this.addComponent(new BeefPatty());
         this.addComponent(new PasteurizedProcessAmericanCheese());
     }
}
