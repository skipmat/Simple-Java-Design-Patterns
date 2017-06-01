package co.matt.builder;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import co.matt.builder.Meal;

public class BuilderTest {
	
	@Test
	public void testBuildAVeggieBurgerWithCocaCola() throws Exception {
		MealBuilder mealBuilder = new MealBuilder();		
		Meal meal = mealBuilder.prepareVeggieBurgerMealAndCocaCola();
		
		assertThat(meal.getCost(), is(750.0F));	
	}
	
	@Test
	public void testBuildAVeggieBurgerWithOutCocaCola() throws Exception {
		MealBuilder mealBuilder = new MealBuilder();		
		Meal meal = mealBuilder.prepareVeggieBurgerMealNoDrink();
		
		assertThat(meal.getCost(), is(500.0F));	
	}

}
