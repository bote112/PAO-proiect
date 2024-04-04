package Model;

public class Camera {
    private int id;
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

    // Getters
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

    // Setters
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

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", etaj=" + etaj +
                ", ocupata=" + ocupata +
                ", curata=" + curata +
                ", balcon=" + balcon +
                '}';
    }
}
