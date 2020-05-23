package BuilderPattern.Castle;

public class HumanCastleBuilder implements CastleBuilder {
    private Castle castle;

    public HumanCastleBuilder(){
        castle = new Castle();
    }
    @Override
    public void addName() {
        castle.setName("Minas Tirith");
    }

    @Override
    public void addFlag() {
        castle.setFlag("Valinor");
    }

    @Override
    public void addKing() {
        castle.setKing("King Calihmetar");
    }

    @Override
    public void addRace() {
        castle.setRace("Human");
    }

    @Override
    public Castle getCastle() {
        return castle;
    }
}

