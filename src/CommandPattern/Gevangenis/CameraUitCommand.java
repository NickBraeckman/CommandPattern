package CommandPattern.Gevangenis;

public class CameraUitCommand implements Command {
    Camera camera;
    int vorigeZoom;

    public CameraUitCommand(Camera camera){
        this.camera = camera;
    }

    @Override
    public void execute() {
        vorigeZoom = camera.getZoomBereik();
        camera.uit();
    }

    @Override
    public void undo() {
        camera.checkStatus(vorigeZoom, camera);
    }
}
