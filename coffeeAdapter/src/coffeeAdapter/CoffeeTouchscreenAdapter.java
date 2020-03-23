package coffeeAdapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldMachine;
	
	CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine ) {
		this.oldMachine = oldMachine;
	}
	
	public String chooseFirstSelection() {
		return this.oldMachine.selectA();
		
	}

	public String chooseSecondSelection() {
		return this.oldMachine.selectB() ;
	}
}
