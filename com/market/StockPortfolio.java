package com.market;

public class StockPortfolio {
	String stockName;
	int numberOfShare;
	double sharePrice;
	static double totalStockValue = 0;
	
	public StockPortfolio(String stockName, int numberOfShare, int sharePrice) {
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	
	}
	
	@Override
	public String toString() {
		eachStockValue(numberOfShare, sharePrice);
		return "stockName=" + stockName + ",\n numberOfShare=" + numberOfShare + ",\n sharePrice="
				+ sharePrice + ",\n totalStockValue=" + totalStockValue;
	}

	public double eachStockValue(int number, double price) {
		double value;
		value = number * price; 
		totalStockValue = totalStockValue + value;
		return value;
	}

}
