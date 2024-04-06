package model;

public class CameraSingle extends Camera {

    public CameraSingle(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        super(id, etaj, ocupata, curata, balcon);
    }

    @Override
    public int calculeazaPretPeNoapte() {
        int pret = 1000;
        int pretPeNoapte = pret + getEtaj() * 100 + (isBalcon() ? 250 : 0);

        return pretPeNoapte;
    }

    @Override
    public String toString() {
        return "CameraSingle{" +
                "pretPeNoapte=" + calculeazaPretPeNoapte() +
                "} " + super.toString();
    }
}
