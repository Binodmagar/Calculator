package com.binod.calculator;

public class Calculator {

    private  float num1;
    private  float num2;
    private  float result;

    public Calculator(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public  float add(){
        result = num1 + num2;
        return result;
    }
    public  float sub(){
        result = num1 - num2;
        return result;
    }
    public  float multiply(){
        result = num1 * num2;
        return result;
    }
    public  float div(){
        result = num1 / num2;
        return result;
    }
}
