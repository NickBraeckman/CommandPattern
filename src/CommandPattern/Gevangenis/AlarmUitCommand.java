package CommandPattern.Gevangenis;

public class AlarmUitCommand implements Command {

    Alarm alarm;
    public AlarmUitCommand(Alarm alarm){
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.uit();
    }

    @Override
    public void undo() {
        alarm.aan();
    }
}
