package co.matt.decorator;

public class WithMilk implements Purchase{
	
	private Purchase purchase;
	Integer price = 10;

	public WithMilk(Purchase purchase){
		this.purchase = purchase;
	}

	@Override
	public Integer getPrice() {
		return purchase.getPrice() + price;
	}

}
