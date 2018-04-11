package com.avuthu.insurance.quote;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class QuoteBuilderTest {
	
	/**
	 * Name: Norman Gomes
			Gender: Male
			Age: 34 years
			Current health:
			
			
			Hypertension: No
			Blood pressure: No
			Blood sugar: No
			Overweight: Yes
			
			
			Habits:
			
			
			Smoking: No
			Alcohol: Yes
			Daily exercise: Yes
			Drugs: No
			
			Health Insurance Premium for Mr. Gomes: Rs. 6,856
	 */
	@Test
	public void getQuoteValue() {
		QuoteBuilder qb = new QuoteBuilder();
		qb.addAgeFactor(34)
		.addGenderFactor('M')
		.addHealthFactor(new ClientHealthCondition(false, false, false, true))
		.addHabitsFactor(new ClientHabits(false, true, true, false ));
		assertThat("computed value is not correct", (qb.getQuoteValue() > 6000));
		
	}
}
