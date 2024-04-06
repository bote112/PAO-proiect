package model;

import java.time.LocalDate;

public class CalculSejur {
    public static int calculeazaPretSejur(Rezervare rezervare) {
        Camera camera = CameraFactory.createCamera(0, 0, false, false, false, 0);
        LocalDate dataInceput = rezervare.getDataInceput();
        LocalDate dataSfarsit = rezervare.getDataSfarsit();
    }
}