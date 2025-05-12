package org.designpatterns.behavioral.template;

public class Application {
    public static void main(String[] args) {
        ReportGenerator textGenerator = new TextReportGenerator();
        textGenerator.generateReport();

        System.out.println("---");

        ReportGenerator pdfGenerator = new PDFReportGenerator();
        pdfGenerator.generateReport();
    }
}