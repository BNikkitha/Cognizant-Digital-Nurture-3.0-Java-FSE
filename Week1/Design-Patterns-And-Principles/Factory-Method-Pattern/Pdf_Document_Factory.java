public class Pdf_Document_Factory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
