package App;

 class CheeseBurger extends Sandwich {
    CheeseBurger(){
        this.name = "Cheese Burger";
    }
    protected void prepare(){
        this.addComponent(new LowerRegularBun());
        this.addComponent(new BeefPatty());
        this.addComponent(new PasteurizedProcessAmericanCheese());
        this.addComponent(new Ketchup());
        this.addComponent(new PickleSLices());
        this.addComponent(new Onions());
        this.addComponent(new UpperRegularBun());
    }
}
