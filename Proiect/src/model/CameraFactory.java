
package model;

public class CameraFactory {
    public static createCamera(int id, int etaj, boolean ocupata, boolean curata, boolean balcon, int pretPeNoapte) {
        int tipCamera = (id / 100 ) % 10;
        switch (tipCamera) {
            case 1:
                return new CameraSingle(id, etaj, ocupata, curata, balcon, pretPeNoapte);
            case 2: 
                return new CameraDouble(id, etaj, ocupata, curata, balcon, pretPeNoapte);
            case 3:
                return new CameraDeluxe(id, etaj, ocupata, curata, balcon, pretPeNoapte );
            default:
                throw new IllegalArgumentException("Tipul de camera " +tipCamera + " nu este valid");
        }
    }
}
