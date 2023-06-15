package com.training.designpatterns;

import com.training.designpatterns.adapter.CommonMarketDataReader;
import com.training.designpatterns.adapter.IntelligentStockDataReaderAdapter;
import com.training.designpatterns.adapter.StockDataProvider;
import com.training.designpatterns.adapter.XmlDataBeautifier;

public class PatternRunner {

    public static void main(String[] args) {
        StockDataProvider dataProvider1 = new StockDataProvider(new CommonMarketDataReader());
        System.out.println(dataProvider1.read("capital"));
        System.out.println(dataProvider1.read("money"));

        System.out.println("************************************");

        StockDataProvider dataProvider2 = new StockDataProvider(new IntelligentStockDataReaderAdapter());
        System.out.println(dataProvider2.read("capital"));
        System.out.println(dataProvider2.read("money"));

    }
}
