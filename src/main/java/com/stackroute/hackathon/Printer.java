package com.stackroute.hackathon;

public class Printer {
    private int tonerLevel;
    private int noOfPages;
    private boolean duplex;

    public Printer(int tonerLevel, int noOfPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.noOfPages = noOfPages;
        this.duplex = duplex;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner() {
        if (tonerLevel < 0) {
            System.out.println("input is incorrect");
        }
        if (tonerLevel >= 0 && tonerLevel < 100) {
            tonerLevel = 100;
            System.out.println("Toner is filled");
        } else {
            System.out.println("Your toner is already filled");
        }

    }

    public void printingPage() {

        for (int i = 1; i <= noOfPages; i++) {
            System.out.println("Number of pages printed are: " + i);

        }
        System.out.println("Finished Printing");

    }

    public void checkDuplex() {
        if (duplex) {
            System.out.println("Duplex printer");
        } else {
            System.out.println("printing on one side of the paper");
        }
    }
}
