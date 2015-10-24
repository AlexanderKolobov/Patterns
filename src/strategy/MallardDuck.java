package strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWiyhWings();
		quackBahavior = new Quack();
		
	}

	@Override
	public void display() {
		System.out.println("I'm mallard duck");

	}

}
