import model.*;
//import service.*;
import dao.*;
import factory.*;
import daoservices.*;
import utils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Camera> camere = new ArrayList<>();
        List<Rezervare> rezervari = new ArrayList<>();
        Camera single = CameraFactory.createCamera(1101, 2, false, true, false);
        camere.add(single);
        Camera dubla = CameraFactory.createCamera(1202, 2, false, false, true);
        camere.add(dubla);
        Camera deluxe = CameraFactory.createCamera(2303, 3, false, true, true);
        camere.add(deluxe);
        Client client = new Client(1, "Ion", "Popescu", "ion.popescu@test.ro", "0712345678", "IonPopescu");
        Rezervare prima = new Rezervare(1, LocalDate.of(2021, 6, 1),
                LocalDate.of(2021, 6, 5), 1, true, true, client, single);
        rezervari.add(prima);

        Rezervare doi = new Rezervare(2, LocalDate.of(2022, 6, 10),
                LocalDate.of(2022, 6, 15), 2, false, true, client, dubla);
        rezervari.add(doi);

        Rezervare trei = new Rezervare(3, LocalDate.of(2023, 12, 20),
                LocalDate.of(2023, 12, 22), 1, true, false, client, deluxe);
        rezervari.add(trei);

        System.out.println("Pretul primei rezervari este: " + CalculSejur.calculeazaPretSejur(prima));
        System.out.println("Pretul celei de-a doua rezervari este: " + CalculSejur.calculeazaPretSejur(doi));
        System.out.println("Pretul celei de-a treia rezervari este: " + CalculSejur.calculeazaPretSejur(trei));

        Hotel hotel = new Hotel("HotelulMeu", "Strada Mea", 3, camere, rezervari);
        System.out.println(hotel);
    }

}
