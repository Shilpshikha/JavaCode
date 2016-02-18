package com.training.stru.composite;
import java.util.*;
public class CityLeaf implements Profitable {

	private String cityName;
	private List<Profitable> stores;
	
	public CityLeaf(String cityName){
		super();
		this.cityName = cityName;
		stores = new ArrayList<Profitable>();
	}
	
	
	
	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public List<Profitable> getStores() {
		return stores;
	}



	public void setStores(List<Profitable> stores) {
		this.stores = stores;
	}



	@Override
	public double getProfit() {
		
		double profit = 0;
		for(Profitable pro : stores){
			profit  = profit + pro.getProfit();
		}
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof StoreLeaf){
			stores.add(child);
		}
	}

	@Override
	public void removeLeaf(Profitable child) {
		

	}

}
