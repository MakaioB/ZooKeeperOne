package zookeeperone;

public class Gorilla extends Mammal{
	public int throwSomething(int numTimesThrown) {
		for (int i = 0; i < numTimesThrown; i++) {
			this.energyLevel = energyLevel - 5;			
		}
		System.out.println("Watch out! The Gorilla is throwing something!");
		return this.energyLevel;
	}
	
	public int eatBanana(int numBananaEaten) {
		for (int i = 0; i < numBananaEaten; i++) {
			this.energyLevel = energyLevel + 10;			
		}
		System.out.println("The Gorrilla consumes the Banana with great satisfaction.");
		return this.energyLevel;
	}
	
	public int climb(int numTimesClimbed) {
		for (int i = 0; i < numTimesClimbed; i++) {
			this.energyLevel = energyLevel - 10;			
		}
		System.out.println("The Gorilla climbs a tree!");
		return this.energyLevel;
	}
}
