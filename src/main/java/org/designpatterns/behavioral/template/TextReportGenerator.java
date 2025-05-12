package org.designpatterns.behavioral.template;

// Concrete Subclasses implementing the specific steps
public class TextReportGenerator extends ReportGenerator {
    @Override
    protected void loadData() {
        System.out.println("Loading data for text report.");
        // Load data for text report
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for text report.");
        // Process data for text report
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data as plain text.");
        // Format data as plain text
    }

    @Override
    protected void saveData() {
        System.out.println("Saving text report to a file.");
        // Save text report
    }
}