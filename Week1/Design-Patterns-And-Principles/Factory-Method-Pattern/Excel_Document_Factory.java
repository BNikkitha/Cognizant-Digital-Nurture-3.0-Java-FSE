public class Excel_Document_Factory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new Excel_Document();
    }
}
