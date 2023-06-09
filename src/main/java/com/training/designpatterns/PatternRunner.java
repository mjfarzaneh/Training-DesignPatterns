package com.training.designpatterns;

import com.training.designpatterns.prototype.SalaryProcessor;
import com.training.designpatterns.prototype.SalaryProcessorCache;

public class PatternRunner {

    public static void main(String[] args) {
        //before Cloneable
        /*SalaryProcessor processor1 = new SalaryProcessor("Person 1");
        processor1.calculate();
        System.out.println(processor1);
        SalaryProcessor processor2 = new SalaryProcessor("Person 2");
        processor2.calculate();
        System.out.println(processor2);*/

        /**
         *  After cloneable, settings one time initialize and the other properties
         *  like salary and personName can get their own values.
         */
        SalaryProcessor processor1 = SalaryProcessorCache.getProcessor();
        processor1.setPersonName("Person 1");
        processor1.calculate();

        SalaryProcessor processor2 = SalaryProcessorCache.getProcessor();
        processor2.setPersonName("Person 2");
        processor2.calculate();

        SalaryProcessor processor3 = SalaryProcessorCache.getProcessor();
        processor3.setPersonName("Person 3");
        processor3.calculate();

        System.out.println(processor1);
        System.out.println(processor2);
        System.out.println(processor3);
    }
}
