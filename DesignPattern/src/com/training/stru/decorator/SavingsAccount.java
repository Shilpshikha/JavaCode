package com.training.stru.decorator;
/**
 * 
 * @author sshik1
 *
 * CONCRETE CLASS
 * 
 */
public class SavingsAccount extends BankAccount {

	@Override
	public double balanceToMaintain() {
		
		return 1000.00;
	}

}
