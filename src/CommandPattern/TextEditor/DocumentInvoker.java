package CommandPattern.TextEditor;

import java.util.*;

public class DocumentInvoker {
    Stack<Command> commands;
    private int order;
    private Document document;

    public DocumentInvoker() {
        commands = new Stack<>();
        document = new Document();
        order = 0;
    }

    public void write(String text) {
        commands.add(new EditCommand(document, text));
        order++;
        commands.peek().execute();
    }

    public void undo() {
        order--;
        commands.get(order).undo();
    }

    public void redo() {
        if (order < commands.size()) {
            commands.get(order).redo();
            order++;
        } else {
            System.out.println("Unable to redo operation");
        }
    }


    public void read(Document document) {
        this.document = document;
    }

}
