package fr.leodirect.programme;

public class NoMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoMoneyException() {
		super("Attention balance ne peut pas etre -");
	}

}
