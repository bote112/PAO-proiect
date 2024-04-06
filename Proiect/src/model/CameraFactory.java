
package model;

public class CameraFactory {
    public static Camera createCamera(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        int tipCamera = (id / 100) % 10;
        switch (tipCamera) {
            case 1:
                return new CameraSingle(id, etaj, ocupata, curata, balcon);
            case 2:
                return new CameraDouble(id, etaj, ocupata, curata, balcon);
            case 3:
                return new CameraDeluxe(id, etaj, ocupata, curata, balcon);
            default:
                throw new IllegalArgumentException("Tipul de camera " + tipCamera + " nu este valid");
        }
    }
}
