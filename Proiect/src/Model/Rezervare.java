package model;

import java.time.LocalDate;

import utils.CalculSejur;

public class Rezervare {
    private int id;
    private Camera camera;
    private Client client;

    private LocalDate dataInceput;
    private LocalDate dataSfarsit;

    private int nrPersoane;
    private boolean micDejun;
    private boolean parcare;

    private int pretSejur;

    public Rezervare(int id, LocalDate dataInceput, LocalDate dataSfarsit, int nrPersoane,
            boolean micDejun, boolean parcare, Client client, Camera camera) {
        this.id = id;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.nrPersoane = nrPersoane;
        this.micDejun = micDejun;
        this.parcare = parcare;
        this.client = client;
        this.camera = camera;
    }

    // getters
    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Camera getCamera() {
        return camera;
    }

    public LocalDate getDataInceput() {
        return dataInceput;
    }

    public LocalDate getDataSfarsit() {
        return dataSfarsit;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public boolean isParcare() {
        return parcare;
    }

    public int getPretSejur() {
        return pretSejur;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDataInceput(LocalDate dataInceput) {
        this.dataInceput = dataInceput;
    }

    public void setDataSfarsit(LocalDate dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setParcare(boolean parcare) {
        this.parcare = parcare;
    }

    public void setPretSejur(int pretSejur) {
        this.pretSejur = CalculSejur.calculeazaPretSejur(this);
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", idClient=" + client.getId() +
                ", idCamera=" + camera.getId() +
                ", dataInceput='" + dataInceput + '\'' +
                ", dataSfarsit='" + dataSfarsit + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", micDejun=" + micDejun +
                ", parcare=" + parcare +
                '}';
    }

}
