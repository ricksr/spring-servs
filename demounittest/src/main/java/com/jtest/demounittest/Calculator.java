package com.jtest.demounittest;

public class Calculator {
//    simple test for mockito

    CalculatorService  service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int perform(int i, int j) {
        return service.add(i, j);
    }

// simple test for junit
//    public int add(int i , int j ) {
//        return i + j;
//    }
}
