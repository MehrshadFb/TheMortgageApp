package com.example.themortgageapp;

public class MortgageModel  {
    String p;
    String a;
    String i;
    public MortgageModel(String p, String a, String i) {
        this.p = p;
        this.a = a;
        this.i = i;
    }
    public String computePayment() {
        double price = Double.parseDouble(p);
        int year = Integer.parseInt(a);
        double rate = (Double.parseDouble(i)/100)/12;
        double month = year * 12;
        double result1 = ((rate * price)  / (1 - Math.pow((1 + rate), (-month))));
        String result2 = "$" + String.format("%,.2f",result1);
        return result2;
    }
}
