package org.designpatterns.behavioral.template;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void loadData() {
        System.out.println("Loading data for PDF report.");
        // Load data for PDF report
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for PDF report.");
        // Process data for PDF report
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data as PDF.");
        // Format data as PDF
    }

    @Override
    protected void saveData() {
        System.out.println("Saving PDF report to a file.");
        // Save PDF report
    }
}