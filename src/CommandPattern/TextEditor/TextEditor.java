package CommandPattern.TextEditor;

public class TextEditor {
    public static void main(String[] args) {
        DocumentInvoker documentInvoker = new DocumentInvoker();
        documentInvoker.write("test");
        documentInvoker.write("test2");
        documentInvoker.write("test3");
        documentInvoker.undo();
        documentInvoker.redo();
        documentInvoker.undo();
        documentInvoker.undo();
        documentInvoker.redo();
        documentInvoker.redo();
        documentInvoker.write("test4");
        documentInvoker.undo();
    }
}
