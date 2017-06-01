package co.matt.builder;

public class MealBuilder {
	
	public Meal prepareVeggieBurgerMealAndCocaCola(){
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		meal.addItem(new CocaCola());
		return meal;
	}
	
	public Meal prepareVeggieBurgerMealNoDrink(){
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		return meal;
	}
}