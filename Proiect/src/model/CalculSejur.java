package model;

import java.time.LocalDate;

public class CalculSejur {
    public static int calculeazaPretSejur(Rezervare rezervare) {
        Camera camera = CameraFactory.createCamera(rezervare.getCamera().getId(), rezervare.getCamera().getEtaj(),
                rezervare.getCamera().isOcupata(), rezervare.getCamera().isCurata(), rezervare.getCamera().isBalcon(),
                rezervare.getCamera().getPretPeNoapte());
        LocalDate dataInceput = rezervare.getDataInceput();
        LocalDate dataSfarsit = rezervare.getDataSfarsit();
    }
}