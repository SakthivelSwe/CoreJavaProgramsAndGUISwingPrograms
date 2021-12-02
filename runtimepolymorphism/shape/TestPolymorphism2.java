package com.runtimepolymorphism.shape;

public class TestPolymorphism2 {
    public static void main(String args[]){
        shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Traiangle();
        s.draw();
    }
}
