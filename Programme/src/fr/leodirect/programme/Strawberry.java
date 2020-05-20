package fr.leodirect.programme;

public class Strawberry extends Fruit {

	public Strawberry() {
		super("fraise");
		
	}

	@Override
	public void taste() {
		System.out.println("Goût sucré");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

}
