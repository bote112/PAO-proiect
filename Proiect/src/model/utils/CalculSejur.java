package model.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Camera;
import model.CameraFactory;
import model.Rezervare;

public class CalculSejur {
    public static int calculeazaPretSejur(Rezervare rezervare) {
        Camera camera = CameraFactory.createCamera(rezervare.getCamera().getId(), rezervare.getCamera().getEtaj(),
                rezervare.getCamera().isOcupata(), rezervare.getCamera().isCurata(), rezervare.getCamera().isBalcon());

        LocalDate dataInceput = rezervare.getDataInceput();
        LocalDate dataSfarsit = rezervare.getDataSfarsit();
        long nrNopti = ChronoUnit.DAYS.between(dataInceput, dataSfarsit);

        int pretSejur = (int) (nrNopti * camera.calculeazaPretPeNoapte());

        if (rezervare.isMicDejun()) {
            pretSejur += nrNopti * 50;
        }

        if (rezervare.isParcare()) {
            pretSejur += nrNopti * 30;
        }

        return pretSejur;
    }
}