package zookeeperone;

public class Gorilla extends Mammal{
	public void throwSomething(int numTimesThrown) {
		for (int i = 0; i < numTimesThrown; i++) {
			this.changeEnergy(-5);			
		}
		System.out.println("Watch out! The Gorilla is throwing something!");
		
	}
	
	public void eatBanana(int numBananaEaten) {
		for (int i = 0; i < numBananaEaten; i++) {
			this.changeEnergy(10);				
		}
		System.out.println("The Gorrilla consumes the Banana with great satisfaction.");
			
	}
	
	public void climb(int numTimesClimbed) {
		for (int i = 0; i < numTimesClimbed; i++) {
			this.changeEnergy(-10);				
		}
		System.out.println("The Gorilla climbs a tree!");
	}
}
