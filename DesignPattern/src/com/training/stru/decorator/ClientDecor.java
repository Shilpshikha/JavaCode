package com.training.stru.decorator;

public class ClientDecor {

	public static void main(String[] args) {
	
		OnlineBanking acc = new OnlineBanking(new SavingsAccount());
		System.out.println(acc.balanceToMaintain());
		
		BankAccount acc2 = new SocialNetBanking(new OnlineBanking(new SavingsAccount()));
		System.out.println(acc2.balanceToMaintain());
	}

}
