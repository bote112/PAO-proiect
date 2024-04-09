package daoservices;

import dao.RezervareDao;
import model.Rezervare;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class RezervareRepositoryService {
    private RezervareDao rezervareDao;

    public RezervareRepositoryService() {
        rezervareDao = new RezervareDao();
    }

    public Rezervare getRezervareById(int id) {
        Rezervare rezervare = rezervareDao.read(id);
        if (rezervare != null) {
            System.out.println(rezervare);
        } else {
            System.out.println("Rezervarea cu id-ul " + id + " nu exista");
        }
        return rezervare;
    }

    public List<Rezervare> getRezervari() {
        List<Rezervare> rezervari = rezervareDao.getAll();
        if (rezervari.isEmpty()) {
            System.out.println("Nu exista rezervari");
        } else {
            for (Rezervare r : rezervari) {
                System.out.println(r);
            }
        }
        return rezervari;
    }

    public List<Rezervare> sortRezervareByDate() {
        List<Rezervare> rezervariSortate = rezervareDao.getAll();
        rezervariSortate.sort(Comparator.comparing(Rezervare::getDataInceput));
        return rezervariSortate;
    }

    public void addRezervare(Rezervare rezervare) {
        rezervareDao.create(rezervare);
    }

    public void deleteRezervare(int id) {
        Rezervare rezervare = getRezervareById(id);
        if (rezervare != null) {
            rezervareDao.delete(rezervare);
            System.out.println("Rezervarea cu id-ul " + id + " a fost stearsa");
        }
    }
}
