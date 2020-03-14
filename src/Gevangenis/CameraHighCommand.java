package Gevangenis;

public class CameraHighCommand implements Command {
    Camera camera;
    int vorigeZoom;
    public CameraHighCommand(Camera camera){
        this.camera = camera;
    }

    @Override
    public void execute() {
        vorigeZoom = camera.getZoomBereik();
        camera.high();
    }

    @Override
    public void undo() {
        camera.checkStatus(vorigeZoom, camera);
    }
}
