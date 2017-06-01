package co.matt.decorator;

public class WithSugar implements Purchase{
	
	private Purchase purchase;
	Integer price = 5;

	public WithSugar(Purchase purchase){
		this.purchase = purchase;
	}

	@Override
	public Integer getPrice() {
		return purchase.getPrice() + price;
	}

}
