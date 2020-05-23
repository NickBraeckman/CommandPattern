package CommandPattern.Gevangenis;

public class CameraMediumCommand implements Command {
    Camera camera;
    int vorigeZoom;

    public CameraMediumCommand(Camera camera){
        this.camera = camera;
    }

    @Override
    public void execute() {
        vorigeZoom = camera.getZoomBereik();
        camera.medium();
    }

    @Override
    public void undo() {
       camera.checkStatus(vorigeZoom, camera);
    }
}
