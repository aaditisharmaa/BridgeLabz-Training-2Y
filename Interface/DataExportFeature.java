interface Exporter {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exporting data in JSON format...");
    }
}

class ReportGenerator implements Exporter {
    public void exportCSV() { System.out.println("CSV exported."); }
    public void exportPDF() { System.out.println("PDF exported."); }
}

public class DataExportFeature {
    public static void main(String[] args) {
        Exporter r = new ReportGenerator();
        r.exportCSV();
        r.exportPDF();
        r.exportJSON();
    }
}
