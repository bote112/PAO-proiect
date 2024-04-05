package model;

public class CameraSingle extends Camera {

    private int pretPeNoapte;

    public CameraSingle(int id, int etaj, boolean ocupata, boolean curata, boolean balcon, int pretPeNoapte) {
        super(id, etaj, ocupata, curata, balcon);
        this.pretPeNoapte = pretPeNoapte;
    }

    public double getPretPeNoapte() {
        return pretPeNoapte;
    }

    public void setPretPeNoapte(int pretPeNoapte) {
        this.pretPeNoapte = pretPeNoapte;
    }

    @Override
    public void calculeazaPretPeNoapte() {
        int pret = 1000;
        pretPeNoapte = pret + getEtaj() * 100 + (isBalcon() ? 250 : 0);
    }

    @Override
    public String toString() {
        return "CameraSingle{" +
                "pretPeNoapte=" + pretPeNoapte +
                "} " + super.toString();
    }
}
