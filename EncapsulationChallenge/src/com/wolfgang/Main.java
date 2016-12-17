package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(75.0, 0, true);

	    printer.fillPrinterToner();
	    printer.fillPrinterToner();

	    printer.printPages(3);
	    printer.printPages(2);

        printer.printPages(-2);
    }
}
