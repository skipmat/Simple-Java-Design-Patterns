package co.matt.decorator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class DecoratorTest {
	
	@Test
	public void testDecoratorDesignPattern() throws Exception {
		Coffee coffee = new Coffee();
		assertThat(new WithMilk(new WithSugar(coffee)).getPrice(), is(215));
	}
	
	@Test
	public void testDecoratorDesignPattern2() throws Exception {
		Tea tea = new Tea();
		assertThat(new WithMilk(new WithSugar(tea)).getPrice(), is(165));
	}

}
