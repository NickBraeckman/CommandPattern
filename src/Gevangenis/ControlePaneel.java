package Gevangenis;

import java.util.Arrays;

public class ControlePaneel {
    private Command[] aanCommands;
    private Command[] uitCommands;
    private Command undoCommand;

    public ControlePaneel() {
        aanCommands = new Command[5];
        uitCommands = new Command[5];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            aanCommands[i] = noCommand;
            uitCommands[i] = noCommand;
        }

        undoCommand = noCommand;

    }

    public void setCommand(int slot, Command aanCommand, Command uitCommand) {
        aanCommands[slot] = aanCommand;
        uitCommands[slot] = uitCommand;
    }

    public void aanKnopGedrukt(int slot) {
        if (aanCommands != null) {
            aanCommands[slot].execute();
            undoCommand = aanCommands[slot];
        }
    }

    public void uitKnopGedrukt(int slot) {
        if (uitCommands[slot] != null) {
            uitCommands[slot].execute();
            undoCommand = uitCommands[slot];
        }
    }

    public void undoKnopGedrukt(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "ControlePaneel{" +
                "aanCommands=" + Arrays.toString(aanCommands) +
                ", uitCommands=" + Arrays.toString(uitCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
