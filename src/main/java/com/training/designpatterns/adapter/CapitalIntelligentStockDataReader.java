package com.training.designpatterns.adapter;

public class CapitalIntelligentStockDataReader implements IntelligentStockDataReader{
    @Override
    public JsonData read() {
        return new JsonData("Capital market intelligent data");
    }
}
