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
	}

}
