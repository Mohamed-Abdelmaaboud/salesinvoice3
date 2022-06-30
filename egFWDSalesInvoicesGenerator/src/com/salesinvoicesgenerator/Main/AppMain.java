package com.salesinvoicesgenerator.Main;

// This class defines the App Main Class.

import com.salesinvoicesgenerator.model.FileOperations;
import com.salesinvoicesgenerator.view.SalesInvoicesFrame;


public class AppMain {
    public static void main(String[] args) {
        SalesInvoicesFrame f = new SalesInvoicesFrame();
        f.setVisible(true);
        FileOperations fileOperations = new FileOperations();
        fileOperations.readFile();
    }

}

