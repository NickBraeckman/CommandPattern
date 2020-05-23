package CommandPattern.TextEditor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> documentText;

    public Document() {
        documentText = new ArrayList<>();
    }

    public void schrijf(String text) {
        documentText.add(text);

    }

    public void wis(String text) {
        documentText.remove(text);

    }


    public void lees() {
        System.out.println("--------");
        for (String line : documentText) {
            System.out.println(line);
        }
    }

}
