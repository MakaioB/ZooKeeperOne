package zookeeperone;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		
		g.throwSomething(3);
		g.displayEnergy();
		
		g.eatBanana(2);
		g.displayEnergy();
		
		g.climb(1);
		g.displayEnergy();
		
//		GiantBat b = new GiantBat();
//		
//		b.fly(2);
//		b.displayEnergy();
//		
//		b.eatHumans(2);
//		b.displayEnergy();
//		
//		b.attackTown(3);
//		b.displayEnergy();
	}

}
