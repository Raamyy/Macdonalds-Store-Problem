package Macdonald;

 class CheeseBurger extends Sandwich {
    CheeseBurger(){
        this.name = "Cheese Burger";
    }

     @Override
     protected String getSlogan() {
         return "The cheesy original.";
     }

     protected void prepare(){
        this.addComponent(new LowerRegularBun());
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
        this.addComponent(new Ketchup());
        this.addComponent(new PickleSlices());
        this.addComponent(new Onions());
        this.addComponent(new UpperRegularBun());
    }
}
