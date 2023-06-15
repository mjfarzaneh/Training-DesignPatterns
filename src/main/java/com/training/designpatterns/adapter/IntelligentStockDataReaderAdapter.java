package com.training.designpatterns.adapter;

public class IntelligentStockDataReaderAdapter implements StockDataReader {

    private IntelligentStockDataReader intelligentReader;


    @Override
    public XmlData readData(String market) {

        if (market.compareToIgnoreCase("money") == 0) {
            intelligentReader = new MoneyIntelligentStockDataReader();
        } else if (market.compareToIgnoreCase("capital") == 0) {
            intelligentReader = new CapitalIntelligentStockDataReader();
        } else {
            System.out.println("Error: Market not found");
        }
        return convert(intelligentReader.read());
    }

    private XmlData convert(JsonData jsonData) {
        return new XmlData(jsonData.getJsonData());
    }
}
