package BuilderPattern.Castle;

public class OrkCastleBuilder implements CastleBuilder {
    private Castle castle;

    public OrkCastleBuilder(){
        castle = new Castle();
    }
    @Override
    public void addName() {
        castle.setName("Ork Camp");
    }

    @Override
    public void addFlag() {
        castle.setFlag("Angry Skull Crushers");
    }

    @Override
    public void addKing() {
        castle.setKing("Ork King");
    }

    @Override
    public void addRace() {
        castle.setRace("Green Ork");
    }

    @Override
    public Castle getCastle() {
        return castle;
    }
}
