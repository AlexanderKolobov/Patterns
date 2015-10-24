package strategy;

public class StrategyDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuck();
		mallard.setQuckBehavior(new MuteQuack());
		System.out.println("Please shut up!");
		mallard.performQuck();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuck();
		rubberDuck.setFlyBehavior(new FlyWiyhWings());
		System.out.println("Oh! Now I can fly!");
		rubberDuck.performFly();
	}

}
