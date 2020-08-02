package headfirst.composite.duck;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	void simulate() {
		Quackable mallardDuck = new MallarDuck();
		Quackable redHeadDuck = new RedHeadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator starting...");
		
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
