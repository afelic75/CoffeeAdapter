package coffeeAdapter;

public class Main {
	
	public static void main (String[] args) {
		OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter myAdapter = new CoffeeTouchscreenAdapter(oldMachine);
		
		
		System.out.println( myAdapter.chooseFirstSelection());
		System.out.println( myAdapter.chooseSecondSelection());
	}

}
