package strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBahavior quackBahavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuck() {
		quackBahavior.quack();
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuckBehavior(QuackBahavior qb) {
		quackBahavior = qb;
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	};

}
