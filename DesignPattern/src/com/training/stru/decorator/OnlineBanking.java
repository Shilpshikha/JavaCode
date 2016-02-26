package com.training.stru.decorator;

public class OnlineBanking extends FeatureDecorator {

	private BankAccount acc;
	
	public OnlineBanking(BankAccount account) {
		super(account);
		acc= account;
	}

	@Override
	public double balanceToMaintain() {
		
		return acc.balanceToMaintain() + 5000.00;
	}

}
