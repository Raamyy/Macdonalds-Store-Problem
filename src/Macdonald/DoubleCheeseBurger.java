package Macdonald;

 class DoubleCheeseBurger extends Sandwich {
    DoubleCheeseBurger(){
        super();
        this.name = "Double Cheese Burger";
    }
    protected void prepare(){
        this.addComponent(new LowerRegularBun());
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
        this.addComponent(new Ketchup());
        this.addComponent(new PickleSlices());
        this.addComponent(new Onions());
        this.addComponent(new UpperRegularBun());
    }
}
