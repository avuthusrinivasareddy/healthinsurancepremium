package com.avuthu.insurance.quote;

public class ClientHabits {
	boolean smoking;
	boolean alcohol;
	boolean dailyExercise;
	boolean drugs;
	
	public ClientHabits(boolean smoking, boolean alcohol, boolean dailyExercise, boolean drugs) {
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.dailyExercise = dailyExercise;
		this.drugs = drugs;
	}
	
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	public boolean isAlcohol() {
		return alcohol;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	public boolean isDailyExercise() {
		return dailyExercise;
	}
	public void setDailyExercise(boolean dailyExercise) {
		this.dailyExercise = dailyExercise;
	}
	public boolean isDrugs() {
		return drugs;
	}
	public void setDrugs(boolean drugs) {
		this.drugs = drugs;
	}
	
	
}
