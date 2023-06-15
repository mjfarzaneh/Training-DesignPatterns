package com.training.designpatterns.adapter;

public class StockDataProvider {

    private StockDataReader stockDataReader;
    public StockDataProvider(StockDataReader stockDataReader){
        this.stockDataReader = stockDataReader;
    }
    public String read(String market){
        return XmlDataBeautifier.format(stockDataReader.readData(market));
    }
}
