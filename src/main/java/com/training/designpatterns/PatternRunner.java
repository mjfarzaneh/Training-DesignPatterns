package com.training.designpatterns;

import com.training.designpatterns.singleton.SingleObject;

public class PatternRunner {

    public static void main(String[] args) {
        SingleObject.getInstance().showMessage();
    }
}
