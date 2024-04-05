package model;

public class CameraDeluxe extends Camera {

    private int pretPeNoapte;

    public CameraDeluxe(int id, int etaj, boolean ocupata, boolean curata, boolean balcon, int pretPeNoapte) {
        super(id, etaj, ocupata, curata, balcon);
        this.pretPeNoapte = pretPeNoapte;
    }

    public int getPretPeNoapte() {
        return pretPeNoapte;
    }

    public void setPretPeNoapte(int pretPeNoapte) {
        this.pretPeNoapte = pretPeNoapte;
    }

    @Override
    public void calculeazaPretPeNoapte() {
        int pret = 10000;
        pretPeNoapte = pret + getEtaj() * 500 + (isBalcon() ? 1000 : 0);
    }

    @Override
    public String toString() {
        return "CameraDeluxe{" +
                "pretPeNoapte=" + pretPeNoapte +
                "} " + super.toString();
    }
}
