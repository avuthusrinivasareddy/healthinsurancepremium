package com.avuthu.insurance.quote;

public class ClientHealthCondition {
	boolean hypertension;
	boolean bloodPressure;
	boolean bloodSugar;
	boolean overweight;
	
	public ClientHealthCondition(boolean hypertension
			, boolean bloodPressure
			, boolean bloodSugar
			, boolean overweight) {
		this.bloodPressure = bloodPressure;
		this.bloodSugar = bloodSugar;
		this.hypertension = hypertension;
		this.overweight = overweight;
	}
	
	public boolean isHypertension() {
		return hypertension;
	}
	public void setHypertension(boolean hypertension) {
		this.hypertension = hypertension;
	}
	public boolean isBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(boolean bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public boolean isBloodSugar() {
		return bloodSugar;
	}
	public void setBloodSugar(boolean bloodSugar) {
		this.bloodSugar = bloodSugar;
	}
	public boolean isOverweight() {
		return overweight;
	}
	public void setOverweight(boolean overweight) {
		this.overweight = overweight;
	}
}