package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nume;
    private String adresa;
    private int nrEtaje;
    private List<Camera> camere;
    private List<Rezervare> rezervari;

    public Hotel(String nume, String adresa, int nrEtaje) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrEtaje = nrEtaje;
        this.camere = new ArrayList<>();
        this.rezervari = new ArrayList<>();
    }

    // getters
    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public List<Rezervare> getRezervari() {
        return rezervari;
    }

    // setters
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }

    public void setCamere(List<Camera> camere) {
        this.camere = camere;
    }
}