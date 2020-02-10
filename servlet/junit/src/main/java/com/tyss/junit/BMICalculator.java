package com.tyss.junit;

public class BMICalculator {

	public double calculateBmi(double height,double weight) {
		return weight/height;

	}
	public String getBmiResult(double res) {
		
		if (res<18.5) {
			return "Under weight";
		} else if(res >= 18.5 && res<25){
			return "Normal";
		}
		else if(res>25&&res<35){

			return "Over weight";
		}
		else {

			return "Obesity";
		}

	}
}
