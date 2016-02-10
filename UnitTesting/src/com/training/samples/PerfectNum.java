package com.training.samples;

public class PerfectNum {

	
	private int sum = 0;
	private int n;
	
	
	public PerfectNum(){
		
	}
	public PerfectNum(int n) throws Exception{
		
			if(n>0)
				this.n = n;
			else 
				throw new Exception();
	}
	


	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public boolean isPerfectNum(int n){
		
			for(int j=1;j<=n/2;j++){
				if(n%j==0)
					sum = sum + j;
				}
			if(sum==n){
				System.out.println("No. is perfect no.");
				return true;
			}
			else
				{
				System.out.println("No. is not perfect no.");
				return false;
				}
		}
	

	
}