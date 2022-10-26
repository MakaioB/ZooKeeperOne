package zookeeperone;

public class GiantBat extends Mammal{
	private int energyLevel = 300;
	
	public int fly(int numTimesFlown) {
		for (int i = 0; i < numTimesFlown; i++) {
			this.energyLevel = energyLevel - 50;			
		}
		System.out.println("Fwooosh");
		return this.energyLevel;
	}
	
	public int eatHumans(int numHumansEaten) {
		for (int i = 0; i < numHumansEaten; i++) {
			this.energyLevel = energyLevel + 25;			
		}
		System.out.println("The Horror...");
		return this.energyLevel;
	}
	
	public int attackTown(int numTownsAttacked) {
		for (int i = 0; i < numTownsAttacked; i++) {
			this.energyLevel = energyLevel - 100;			
		}
		System.out.println("*Burning noises, crying, and screaming*");
		return this.energyLevel;
	}
}
