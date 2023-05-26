package com.training.designpatterns.singleton;

public class SingleObject {

    private static SingleObject singleObject /*= new SingleObject()*/;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        /*
        If you want to create a lazy loading singleton pattern,
        you must check if singleObject is null, then create it.
        And do not initialize it in the "private static SingleObject singleObject" line.
         */
        if (singleObject == null) {
            /*
            this code has better performance than to synchronized getInstance method.
             */
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
