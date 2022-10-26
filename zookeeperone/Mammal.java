package zookeeperone;

public class Mammal {
	int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("The mammals enery level is " + energyLevel + "%!");
		return this.energyLevel;
	}
}


