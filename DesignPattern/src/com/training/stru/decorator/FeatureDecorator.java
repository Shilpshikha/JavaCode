package com.training.stru.decorator;
/**
 * 
 * @author sshik1
 * 
 * DECORATOR
 * 
 */
public abstract class FeatureDecorator extends BankAccount {

	
	private BankAccount account;

	public FeatureDecorator(BankAccount account) {
		super();
		this.account = account;
	}
	

}
