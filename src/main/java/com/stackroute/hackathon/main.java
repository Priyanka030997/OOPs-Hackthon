package com.stackroute.hackathon;

public class main {
    public static void main(String args[])
    {
        Printer printer=new Printer(80,10,true);
        printer.fillToner();
        printer.printingPage();
        printer.checkDuplex();
    }
}

