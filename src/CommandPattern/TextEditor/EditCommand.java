package CommandPattern.TextEditor;

public class EditCommand implements Command {
    private Document document;
    private String text;

    public EditCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.schrijf(text);
        document.lees();
    }

    @Override
    public void undo() {
        document.wis(text);
        document.lees();
    }

    @Override
    public void redo() {
        document.schrijf(text);
        document.lees();
    }
}
