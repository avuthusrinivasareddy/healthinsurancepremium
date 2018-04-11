package com.avuthu.insurance.quote;


/**
 * Base premium for anyone below the age of 18 years = Rs. 5,000
% increase based on age: 18-25 -> + 10% | 25-30 -> +10% | 30-35 -> +10% | 35-40 -> +10% | 40+ -> 20% increase every 5 years
Gender rule: Male vs female vs Other % -> Increase 2% over standard slab for Males
Pre-existing conditions (Hypertension | Blook pressure | Blood sugar | Overweight) -> Increase of 1% per condition
Habits


Good habits (Daily exercise) -> Reduce 3% for every good habit
Bad habits (Smoking | Consumption of alcohol | Drugs) -> Increase 3% for every bad habit
 * @author SravaniKarasani
 *
 */

public class QuoteBuilder {
	
	private double quoteValue = 5000;
	
	public double getQuoteValue() {
		return quoteValue;
	}
	
	public QuoteBuilder addAgeFactor(int age) {
		if(age >=18){
			int temp2 = 1;
			if(age > 25) {
				int temp = age - 25;
				temp2 = temp2 + temp/5;
			}
			
			for(int i=1; i <= temp2; i++) {
				double percentInc = i <= 4 ? 0.1 : 0.2;
				quoteValue = quoteValue + (quoteValue * percentInc);
			}
		}
		return this;
	}
	
	public QuoteBuilder addGenderFactor(char gender) {
		if(gender == 'M') {
			quoteValue = quoteValue+(quoteValue * 0.02);
		}
		return this;
	}
	
	public QuoteBuilder addHealthFactor(ClientHealthCondition healthCondition) {
		if(healthCondition.isBloodPressure()) {
			quoteValue = quoteValue + (quoteValue * 0.01);
		}
		
		if(healthCondition.isBloodSugar()) {
			quoteValue = quoteValue + (quoteValue * 0.01);
		}
		
		if(healthCondition.isHypertension()) {
			quoteValue = quoteValue + (quoteValue * 0.01);
		}
		
		if(healthCondition.isOverweight()) {
			quoteValue = quoteValue + (quoteValue * 0.01);
		}
		
		return this;
	}
	
	public QuoteBuilder addHabitsFactor(ClientHabits habits) {
		
		if(habits.isDrugs()) {
			quoteValue = quoteValue + (quoteValue * 0.03);
		}
		if(habits.isSmoking()) {
			quoteValue = quoteValue + (quoteValue * 0.03);
		}
		if(habits.isAlcohol()) {
			quoteValue = quoteValue + (quoteValue * 0.03);
		}
		if(habits.isDailyExercise()) {
			quoteValue = quoteValue - (quoteValue * 0.03);
		}
		return this;
	}
}