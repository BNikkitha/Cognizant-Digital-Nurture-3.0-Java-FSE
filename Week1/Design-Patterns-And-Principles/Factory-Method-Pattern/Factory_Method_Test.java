public class Factory_Method_Test {
    public static void main(String[] args) {
        // Create a Word Document
        DocumentFactory wordFactory = new Word_Document_Factory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        // Create a PDF Document
        DocumentFactory pdfFactory = new Pdf_Document_Factory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        // Create an Excel Document
        DocumentFactory excelFactory = new Excel_Document_Factory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}
