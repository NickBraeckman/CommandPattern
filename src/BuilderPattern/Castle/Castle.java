package BuilderPattern.Castle;

public class Castle {

    private String name;
    private String flag;
    private String king;
    private String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                ", king='" + king + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
