package strategy;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
	flyBehavior = new FlyWiyhWings();
	quackBahavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm mallard redhead duck");
	}

}
