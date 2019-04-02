package com.Krzysztof;

public class Toner {
    private int tonerLevel;

    public Toner(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void changeToner(){
        System.out.println("Toner changed");
        tonerLevel = 100;
    }

    public boolean tonerPrint(){
        if(tonerLevel>0) {
            return true;
        }
        else
        {
            System.out.println("out of toner. fill him up");
            return false;
        }
    }

    public void print(){
        tonerLevel--;
    }

    public void fillUpToner(int amount){
        if(tonerLevel+amount>0 && tonerLevel+amount<=100){
            tonerLevel+=amount;
            System.out.println("Toner filled to: " + tonerLevel);
        }
        else{
            System.out.println("Something goes wrong");
        }
    }
}
