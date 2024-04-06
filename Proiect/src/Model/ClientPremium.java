package model;

public class ClientPremium extends Client {
    private int pctFidelitate; // pentru fiecare punct de fideliare se va scadea 1% din pretul total al camerei

    public ClientPremium(int id, String nume, String prenume, String email, String telefon, String parola,
            int pctFidelitate) {
        super(id, nume, prenume, email, telefon, parola);
        this.pctFidelitate = pctFidelitate;
    }

    public int getPctFidelitate() {
        return pctFidelitate;
    }

    public void setPctFidelitate(int pctFidelitate) {
        this.pctFidelitate = pctFidelitate;
    }

    @Override
    public int calculeazaDiscount(int pret) {
        return pret - pctFidelitate * 100;

    }

    @Override
    public String toString() {
        return "ClientPremium{" +
                "pctFidelitate=" + pctFidelitate +
                "} " + super.toString();
    }
}
