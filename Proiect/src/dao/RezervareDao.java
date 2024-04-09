package dao;

import model.Rezervare;

import java.util.ArrayList;
import java.util.List;

public class RezervareDao {

    private static List<Rezervare> rezervari = new ArrayList<>();

    public List<Rezervare> getAll() {
        return rezervari;
    }

    public Rezervare read(int id) {
        for (Rezervare r : rezervari) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public void delete(Rezervare rezervare) {
        rezervari.remove(rezervare);
    }

    public void create(Rezervare rezervare) {
        rezervari.add(rezervare);
    }
}
