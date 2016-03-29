package com.training.impl;

import com.training.iface.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public double dollarToRupees(double dollar) {
		return dollar*58.00;
	}

}
