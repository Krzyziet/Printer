package com.Krzysztof;

public class Printer {
    public Toner toner; //Composition
    public Paper paper;
    private int printAmount;
    private boolean duplex;
    private int pagesPrinted = 0; //variable to show how many pages are printed

    public Printer(boolean duplex, Toner toner, Paper paper) {
        this.toner = toner;
        this.paper = paper;
        this.duplex = duplex;
    }

    private int printedDuplex(int printAmount){ //if you print duplex i have to show pages printed*2 or if it's not even pages printed * 2 + 1
        if(isEven(printAmount)){
            return printAmount*2;
        }
        else{
            return printAmount*2+1;
        }
    }

    private boolean isEven(int printAmount){
        if(printAmount%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(int printAmount){
        this.printAmount = printAmount;
        if(duplex==false){ //printing not duplex every page i take 1% from toner and 1 paper
            for(int i = pagesPrinted;i<printAmount; i++)
            {
                if(toner.tonerPrint()==true && paper.paperPrint()==true) {
                    toner.print();
                    paper.print();
                    pagesPrinted++;
                }
                else{
                    System.out.println("You printed " + pagesPrinted + " pages from " + printAmount);
                    break;
                }
            }
            System.out.println("Succesfull printed " +  pagesPrinted + " pages.");
        }
        else
        {
            this.printAmount = printAmount;
            if(isEven(printAmount)){
                printAmount = printAmount/2;
            }
            else {
                printAmount = printAmount / 2;
                toner.print();
                paper.print();
            }
            for(int i = pagesPrinted;i<printAmount; i++)
            {
                if(toner.tonerPrint()==true && paper.paperPrint()==true) {
                    paper.print();
                    toner.print();
                    toner.print();
                    pagesPrinted++;
                }
                else{
                    System.out.println("You printed " + pagesPrinted + " pages from " + printAmount);
                    break;
                }
            }
            System.out.println("Succesfull printed " +  printedDuplex(pagesPrinted) + " pages.");
        }
    }


    public void print(){
        if(duplex==false){
            for(int i = pagesPrinted;i<printAmount; i++)
            {
                if(toner.tonerPrint()==true && paper.paperPrint()==true) {
                    toner.print();
                    paper.print();
                    pagesPrinted++;
                }
                else{
                    System.out.println("You printed " + pagesPrinted + " pages from " + printAmount);
                    break;
                }
            }
            System.out.println("Succesfull printed " +  pagesPrinted + " pages.");
        }
        else
        {
            if(isEven(printAmount)){
                printAmount = printAmount/2;
            }
            else {
                printAmount = printAmount / 2 + 1;
            }
            for(int i = pagesPrinted;i<printAmount; i++)
            {
                if(toner.tonerPrint()==true && paper.paperPrint()==true) {
                    paper.print();
                    toner.print();
                    toner.print();
                    pagesPrinted++;

                }
                else{
                    System.out.println("You printed " + i + " pages from " + printAmount);
                    break;
                }
            }
            System.out.println("Succesfull printed " +  printedDuplex(pagesPrinted) + " pages.");
        }
    }

}
