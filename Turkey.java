package com.company;

public interface Turkey {

    //method 1 , 2
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}