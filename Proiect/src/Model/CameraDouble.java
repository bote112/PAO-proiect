package model;

public class CameraDouble extends Camera {

    private int pretPeNoapte;

    public CameraDouble(int id, int etaj, boolean ocupata, boolean curata, boolean balcon, int pretPeNoapte) {
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
        int pret = 2000;
        pretPeNoapte = pret + getEtaj() * 125 + (isBalcon() ? 350 : 0);
    }

    @Override
    public String toString() {
        return "CameraDouble{" +
                "pretPeNoapte=" + pretPeNoapte +
                "} " + super.toString();
    }
}
