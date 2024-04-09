package utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import factory.CameraFactory;
import model.Camera;
import model.Rezervare;
import model.Client;
import model.ClientPremium;

public class CalculSejur {
    public static int calculeazaPretSejur(Rezervare rezervare) {

        Camera camera = rezervare.getCamera();

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

        Client client = rezervare.getClient();
        if (client instanceof ClientPremium) {
            ClientPremium clientPremium = (ClientPremium) client;
            clientPremium.calculeazaDiscount(pretSejur);
        }

        return pretSejur;
    }
}