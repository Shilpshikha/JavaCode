package com.training.stru.decorator;

public class SocialNetBanking extends FeatureDecorator {

	private BankAccount account;
	public SocialNetBanking(BankAccount account) {
		super(account);
		this.account = account;
	}

	@Override
	public double balanceToMaintain() {
		return account.balanceToMaintain()  + 2000.00;
	}

}
