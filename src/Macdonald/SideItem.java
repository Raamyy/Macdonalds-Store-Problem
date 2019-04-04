package Macdonald;

/*  Side Items are the secondary items that are served with the Burger in the meal

    Side Items Types:
    - Fries
    - Soda
 */
abstract class SideItem extends Item {
    SideItem(){
        super();
    }

    public void display(){
        System.out.println(this.name);
    }
}
