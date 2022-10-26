package zookeeperone;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("The mammals enery level is " + energyLevel + "!");
		return this.energyLevel;
	}
	
	public void changeEnergy(int change) {
		this.energyLevel += change;
	}
}


