package com.Krzysztof;

public class Main {

    public static void main(String[] args) {
        Toner toner = new Toner(100);
        Paper paper = new Paper(100);
        Printer printer = new Printer(false, toner, paper);

        printer.print(120);
        System.out.println("You still have " + printer.toner.getTonerLevel() + "% toner lvl and " + printer.paper.getPaperLevel() + " paper.");
        printer.toner.changeToner();
        printer.print();
        printer.paper.addPaper(100);
        printer.print();
    }
}
