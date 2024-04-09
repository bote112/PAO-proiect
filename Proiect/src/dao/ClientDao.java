package dao;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    private static List<Client> clienti = new ArrayList<>();

    public Client read(int id) {
        for (Client c : clienti) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void delete(Client client) {
        clienti.remove(client);
    }

    public void create(Client client) {
        clienti.add(client);
    }

}
