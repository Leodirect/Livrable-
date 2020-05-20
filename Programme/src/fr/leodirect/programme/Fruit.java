package fr.leodirect.programme;

public abstract class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
	}
	public abstract void taste();
	public abstract int getSize();
	public abstract boolean hasSeed();
	public void mian() {
		System.out.println("Mian Miam  " + getName());
	}
	public String getName() {
		return name;
	}
}
