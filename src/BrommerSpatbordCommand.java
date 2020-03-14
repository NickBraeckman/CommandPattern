public class BrommerSpatbordCommand implements Command {
    private Garagist garagist;

    public BrommerSpatbordCommand(Garagist garagist){
        this.garagist = garagist;
    }

    @Override
    public void execute() {
        garagist.vervangSpatBord();
        garagist.checkBandenSpanning();
    }

}
