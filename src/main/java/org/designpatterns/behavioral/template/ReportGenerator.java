package org.designpatterns.behavioral.template;

// Abstract Class defining the template method
public abstract class ReportGenerator {
    public void generateReport() {
        loadData();
        processData();
        formatData();
        saveData();
        System.out.println("Report generation complete.");
    }

    protected abstract void loadData();
    protected abstract void processData();
    protected abstract void formatData();
    protected abstract void saveData();
}