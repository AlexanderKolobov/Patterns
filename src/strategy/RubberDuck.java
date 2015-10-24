package strategy;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBahavior = new Squeck();
	}

	@Override
	public void display() {
		System.out.println("I'm rubber duck");

	}

}
