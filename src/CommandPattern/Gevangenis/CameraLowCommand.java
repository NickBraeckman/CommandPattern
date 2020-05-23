package CommandPattern.Gevangenis;

public class CameraLowCommand implements Command {
    Camera camera;
    int vorigeZoom;

    public CameraLowCommand(Camera camera){
        this.camera = camera;
    }

    @Override
    public void execute() {
        vorigeZoom = camera.getZoomBereik();
        camera.low();
    }

    @Override
    public void undo() {
        camera.checkStatus(vorigeZoom, camera);
    }

}
