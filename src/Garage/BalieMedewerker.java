package Garage;

import java.util.LinkedList;
import java.util.Queue;

public class BalieMedewerker {
    private Queue<Command> commands;

    public BalieMedewerker(){
        commands = new LinkedList<>();
    }

    public void setCommand(Command command){
       commands.add(command);
    }

    public void vraagHerstelling(){
        if (!commands.isEmpty()){
            commands.poll().execute();
        }
    }

}
