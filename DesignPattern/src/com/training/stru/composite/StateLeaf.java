package com.training.stru.composite;
import java.util.*;
public class StateLeaf implements Profitable {

	private String stateName;
	private List<Profitable> cities;
	
	public StateLeaf(String stateName){
		this.stateName = stateName;
		cities = new ArrayList<Profitable>();
	}
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<Profitable> getCities() {
		return cities;
	}

	public void setCities(List<Profitable> cities) {
		this.cities = cities;
	}

	@Override
	public double getProfit() {
		double profit =0;
		for(Profitable pro : cities){
			profit = profit + pro.getProfit();
		}
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof CityLeaf){
			cities.add(child);
		}

	}

	@Override
	public void removeLeaf(Profitable child) {
		
	}

}
