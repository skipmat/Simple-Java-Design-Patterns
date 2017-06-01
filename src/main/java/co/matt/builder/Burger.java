package co.matt.builder;

public abstract class Burger implements Item {
	
	@Override
	public abstract float getPrice();
	
	@Override
	public abstract String getName();

}
