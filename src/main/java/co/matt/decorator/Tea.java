package co.matt.decorator;

public class Tea extends Drink{
	
	Integer price = 150;

	@Override
	public Integer getPrice() {
		return price;
	}

}
