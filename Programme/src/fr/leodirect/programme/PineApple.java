package fr.leodirect.programme;

public class PineApple extends Fruit implements PeelFruit{
	
	private boolean peeled = false;
	public PineApple() {
		super("Annas");

	}

	@Override
	public void taste() {
		System.out.println("Goût acide");
		
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "piquante";
	}

}
