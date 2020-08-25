package com.company;

public interface Duck {

    public void quack();
    public void fly();
}


class SpaceDuck implements Duck{
    public void quack(){
        System.out.println("Quack Noise");
    }
    public void fly(){
        System.out.println("Flying through space");
    }
}