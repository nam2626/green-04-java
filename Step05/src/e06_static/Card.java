package e06_static;

public class Card {
	private int cardNo;
	private String name;

	public Card(int cardNo, String name) {
		super();
		this.cardNo = cardNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return cardNo + " / " + name;
	}

}
