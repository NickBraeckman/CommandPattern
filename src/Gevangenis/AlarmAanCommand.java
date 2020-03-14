package Gevangenis;

public class AlarmAanCommand implements Command {
    Alarm alarm;
    public AlarmAanCommand(Alarm alarm){
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.aan();
    }

    @Override
    public void undo() {
        alarm.uit();
    }
}
