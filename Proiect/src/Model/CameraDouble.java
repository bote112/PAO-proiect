package model;

public class CameraDouble extends Camera {

    public CameraDouble(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        super(id, etaj, ocupata, curata, balcon);
    }

    @Override
    public int calculeazaPretPeNoapte() {
        int pret = 2000;
        int pretPeNoapte = pret + getEtaj() * 125 + (isBalcon() ? 350 : 0);
        return pretPeNoapte;
    }

    @Override
    public String toString() {
        return "CameraDouble{" +
                "pretPeNoapte=" + calculeazaPretPeNoapte() +
                "} " + super.toString();
    }
}
