package com.Krzysztof;

public class Paper {
    private int paperInDrower;

    public Paper(int paperInDrower) {
        this.paperInDrower = paperInDrower;
    }

    public int getPaperLevel() {
        return paperInDrower;
    }

    public boolean paperPrint()
    {
        if(paperInDrower>0){
            return true;
        }
        else{
            System.out.println("Out of paper.");
            return false;
        }
    }

    public void print()
    {
        paperInDrower--;
    }

    public void addPaper(int amount){
        if(paperInDrower+amount>0){
            paperInDrower += amount;
            System.out.println("Paper Added");
        }
        else{
            System.out.println("Something goes wrong.");
        }
    }
}
