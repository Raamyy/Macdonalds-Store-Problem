package App;

public class Main {

    public static void main(String[] args) {

        Sandwich s = SandwichMaker.PrepareSandwich(SandwichType.DoubleCheeseBurger);
        s.prepare();
        s.display();
    }
}
