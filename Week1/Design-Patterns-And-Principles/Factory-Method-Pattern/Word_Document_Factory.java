public class Word_Document_Factory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new Word_Document();
    }
}
