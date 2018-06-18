package model;
public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Duck mallard=new MallardDuck();
    System.out.println("MallardDuck");
    mallard.performQuack();
 //   mallard.setQuackBehavior(new Squeak());
    mallard.performFly();
    
    Duck redhead=new RedHeadDuck();
    System.out.println("RedHeadDuck");
    redhead.performQuack();
    redhead.performFly();
    
	 Duck rubber=new RubberDuck();
	 System.out.println("RubberDuck");
	 rubber.performQuack();
	 rubber.performFly();
		}
}
