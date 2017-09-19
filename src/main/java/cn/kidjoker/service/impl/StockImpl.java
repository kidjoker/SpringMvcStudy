package cn.kidjoker.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import cn.kidjoker.service.TestStock;

@Service
public class StockImpl implements TestStock {

	@Override
	public void getStockData() {
		try {
			Process process = Runtime.getRuntime().exec("python ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
