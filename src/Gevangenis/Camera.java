package Gevangenis;

public class Camera {

    public static final int HIGH_ZOOM = 10;
    public static final int MEDIUM_ZOOM = 5;
    public static final int LOW_ZOOM = 1;
    public static final int UIT = 0;
    private String plaats;
    private int zoombereik;

    public Camera(String plaats){
        this.plaats = plaats;
        zoombereik = LOW_ZOOM;
    }

    public void high(){
        zoombereik = HIGH_ZOOM;
        System.out.println(plaats+": Zoombereik staat op hoog");
    }

    public void medium(){
        zoombereik=MEDIUM_ZOOM;
        System.out.println(plaats + ": Zoombereik staat op matig");
    }

    public void low(){
        zoombereik = LOW_ZOOM;
        System.out.println(plaats+": Zoombereik staat op laag");
    }

    public void uit(){
        zoombereik = UIT;
        System.out.println(plaats+": Camera is uit");
    }

    public int getZoomBereik(){
        return zoombereik;
    }

    public void checkStatus(int vorigeZoom, Camera camera){
        if(vorigeZoom == Camera.HIGH_ZOOM){
            camera.high();
        } else if(vorigeZoom == Camera.MEDIUM_ZOOM){
            camera.medium();
        } else if(vorigeZoom == Camera.LOW_ZOOM){
            camera.low();
        } else if(vorigeZoom == Camera.UIT){
            camera.uit();
        }
    }

    public String getPlaats() {
        return plaats;
    }
}
