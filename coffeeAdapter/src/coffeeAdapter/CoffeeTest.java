package coffeeAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTest {

	@Test
	void test() {
		OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter myAdapter = new CoffeeTouchscreenAdapter(oldMachine);
		
		assertEquals(myAdapter.chooseFirstSelection(), "Pouring Coffee A.");
	}

}
