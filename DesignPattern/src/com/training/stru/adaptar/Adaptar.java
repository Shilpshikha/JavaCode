package com.training.stru.adaptar;

public class Adaptar extends BankAccount{

	private LifeInsurance life;
	
	public Adaptar(double principle, LifeInsurance life) {
		super(principle);
		this.life = life;
		}
	
	/*public double calculate(){
		
		return life.calculatePremium();
		
	}*/
	
	public double findTotalDue(){
		double ins = life.calculatePremium();
		System.out.println("Insurance : " + ins);
		double bankdue = calculate();
		System.out.println("Bankdue : " + bankdue);
		return ins + bankdue;
	}

}
