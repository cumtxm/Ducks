package model;

public class RedHeadDuck extends Duck{
	public  RedHeadDuck(){
		   quackBehavior=new MuteQuack();
		   flyBehavior=new FlyWithRocket();
		    }
	  public void display(){
		   
	   }
}
