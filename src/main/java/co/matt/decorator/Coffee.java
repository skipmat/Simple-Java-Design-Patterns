package co.matt.decorator;

public class Coffee extends Drink{
		
	Integer price = 200; 

	@Override
	public Integer getPrice() {
		return price;
	}

}
