package model;

public class CameraDeluxe extends Camera {

    public CameraDeluxe(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        super(id, etaj, ocupata, curata, balcon);
    }

    @Override
    public int calculeazaPretPeNoapte() {
        int pret = 10000;
        int pretPeNoapte = pret + getEtaj() * 500 + (isBalcon() ? 1000 : 0);
        return pretPeNoapte;
    }

    @Override
    public String toString() {
        return "CameraDeluxe{" +
                "pretPeNoapte=" + calculeazaPretPeNoapte() +
                "} " + super.toString();
    }
}
