package fr.leodirect.programme;

public class Kiwi extends Fruit implements PeelFruit{

	public Kiwi() {
		super("kiwi");
		
	}

	@Override
	public void taste() {
		System.out.println("go�t sucr�");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
