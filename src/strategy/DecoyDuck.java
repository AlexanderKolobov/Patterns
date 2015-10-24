package strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBahavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm decoy duck");

	}

}
