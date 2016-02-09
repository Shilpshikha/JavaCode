/**
 * Create a java class BankAccount;

AccountNumber,AccountHolderName, balance;

the Class has two methods deposit and withdraw with argument amountDeposited or amount withdrawn


 */

package com.training.samples;

public class BankAccount {
 
	private long accno;
	private String accHoldername;
	private double balance;
	
	public BankAccount(long accno, String accHoldername, double balance) {
		super();
	
		this.accno = accno;
		if(accHoldername != null){
			this.accHoldername = accHoldername;
		}
		else throw new RuntimeException();
		this.balance = balance;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getAccHoldername() {
		return accHoldername;
	}

	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double amountDeposited(double amt){
		balance = balance + amt;
		return balance;
	}
	
	public double amountWithdrawn(double amt){
		balance = balance - amt;
		return balance;
	}
	
}
