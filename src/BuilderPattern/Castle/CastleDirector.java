package BuilderPattern.Castle;

public class CastleDirector {
    private CastleBuilder castleBuilder = null;

    public CastleDirector(CastleBuilder castleBuilder){
        this.castleBuilder = castleBuilder;
    }

    public void makeCastle(){
        castleBuilder.addName();
        castleBuilder.addFlag();
        castleBuilder.addKing();
        castleBuilder.addRace();
    }
    public Castle getCastle(){
        return castleBuilder.getCastle();
    }
}
