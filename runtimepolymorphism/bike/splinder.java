package com.runtimepolymorphism.bike;

class splinder extends bike{
    void run(){
        System.out.println("bike safely in 60km");
    }
    public static void main(String args[]) {
        bike b=new splinder();
        b.run();
    }
}

