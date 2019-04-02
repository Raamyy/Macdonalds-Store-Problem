package App;

public class MushromAndSwissBurger extends Sandwich{
    MushromAndSwissBurger(){
        super();
        this.name = "Mushroom and Swiss burger";
    }
    public void prepare(){
        this.components.add(new LowerArtisanRoll());
        this.components.add(new BeefPatty());
        this.components.add(new SwissCheese());
        this.components.add(new SeasonedMushrooms());
        this.components.add(new FriedOnions());
        this.components.add(new BistroAioli());
        this.components.add(new UpperArtisanRoll());
    }
}
