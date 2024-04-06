package model;

public abstract class Camera {
    private int id; // id-ul are urmatoarea semnificatie : x1xx - camera single, x2xx - camera
                    // dubla, x3xx - camera deluxe
    private int etaj;
    private boolean ocupata;
    private boolean curata;
    private boolean balcon;

    public Camera(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        this.id = id;
        this.etaj = etaj;
        this.ocupata = ocupata;
        this.curata = curata;
        this.balcon = balcon;
    }

    // getters
    public int getId() {
        return id;
    }

    public int getEtaj() {
        return etaj;
    }

    public boolean isOcupata() {
        return ocupata;
    }

    public boolean isCurata() {
        return curata;
    }

    public boolean isBalcon() {
        return balcon;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setOcupata(boolean ocupata) {
        this.ocupata = ocupata;
    }

    public void setCurata(boolean curata) {
        this.curata = curata;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    // pentru fiecare tip de camera se va calcula pretul pe noapte in mod
    // diferit(bazat si pe alte atribute ale camerei)
    public abstract int calculeazaPretPeNoapte();

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", etaj=" + etaj +
                ", ocupata=" + ocupata +
                ", curata=" + curata +
                ", balcon=" + balcon + '}';
    }
}
