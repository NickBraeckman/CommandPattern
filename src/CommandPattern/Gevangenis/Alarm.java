package CommandPattern.Gevangenis;

public class Alarm {

    private String plaats;

    public Alarm(String plaats){
        this.plaats = plaats;
    }

    public void aan(){
        System.out.println(plaats + ": Alarm staat aan");
    }

    public void uit(){
        System.out.println(plaats + ": Alarm staat uit");
    }

    public String getPlaats() {
        return plaats;
    }
}
