package com.example.themortgageapp;

import org.junit.Assert;
import org.junit.Test;

public class MortgageModelTest {
    @Test
    public void computePaymentTest() {

        String p, a, i;
        p = "700000"; a = "25"; i = "2.75";
        MortgageModel model = new MortgageModel(p, a, i);
        System.out.println(model.computePayment());

//        p = "300000"; a = "20"; i = "4.5";
//        model = new MortgageModel(p, a, i);
//        System.out.println(model.computePayment());

        p = "700000"; a = "25"; i = "2.75";
        model = new MortgageModel(p, a, i);
        Assert.assertEquals("$3,229.18",model.computePayment());

    }
}
