package com.training.designpatterns.adapter;

public interface StockDataReader {
    XmlData readData(String market);
}
