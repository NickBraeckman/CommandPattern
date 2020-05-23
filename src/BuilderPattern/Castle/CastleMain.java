package BuilderPattern.Castle;

public class CastleMain {
    public static void main(String[] args) {

        CastleBuilder orkCastleBuilder = new OrkCastleBuilder();
        CastleBuilder humanCastleBuilder = new HumanCastleBuilder();
        CastleDirector orkCastleDirector = new CastleDirector(orkCastleBuilder);
        CastleDirector humanCastleDirector = new CastleDirector(humanCastleBuilder);

        orkCastleDirector.makeCastle();
        System.out.println(orkCastleDirector.getCastle());

        humanCastleDirector.makeCastle();
        System.out.println(humanCastleDirector.getCastle());
    }
}
