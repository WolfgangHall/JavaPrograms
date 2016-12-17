package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class Printer {
    private double tonerLevel = 100d;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel >= 0d && tonerLevel < 100d) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    private void checkToner() {
        if (tonerLevel >= 100d) {
            System.out.println("The toner is already full");
        } else {
            this.tonerLevel = 100d;
            System.out.println("You have filled up the printer toner");
        }
    }

    public void fillPrinterToner() {
        this.checkToner();
    }

    private void printPage(int page) {
        if (page > 0) {
            for (int i = 1; i < page + 1; i++) {
                this.pagesPrinted++;
            }
            System.out.println("Pages printed: " + page);
            System.out.println("Number of pages printed in total: " + this.pagesPrinted);

        } else {
            System.out.println("You can't print negative pages");
        }

    }

    private void useToner(int pages) {
        double tonerUsed = pages * 0.5;

        if (pages > 0) {
            this.tonerLevel -= tonerUsed;
            System.out.println("Toner used: " + tonerUsed);
            System.out.println("New toner level: " + this.tonerLevel);
        } else {
            System.out.println("You can't use negative toner");
        }
    }

    public void printPages(int pages) {
        printPage(pages);
        useToner(pages);
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
