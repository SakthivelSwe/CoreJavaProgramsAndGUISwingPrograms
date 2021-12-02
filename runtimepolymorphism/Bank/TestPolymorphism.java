package com.runtimepolymorphism.Bank;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestPolymorphism {
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        System.out.println("SBI intrested is " + b.getRateOfIntrest());
        b=new ICICI();
        System.out.println("ICICI intrested is "+ b.getRateOfIntrest());
        b=new Axis();
        System.out.println("Axis intrested is " + b.getRateOfIntrest());
    }

}
