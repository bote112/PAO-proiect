package dao;

import model.ClientPremium;

import java.util.ArrayList;
import java.util.List;

public class ClientPremiumDao {
    private static List<ClientPremium> clientiPremium = new ArrayList<>();

    public ClientPremium read(int id) {
        for (ClientPremium cp : clientiPremium) {
            if (cp.getId() == id) {
                return cp;
            }
        }
        return null;
    }

    public void delete(ClientPremium clientPremium) {
        clientiPremium.remove(clientPremium);
    }

    public void create(ClientPremium clientPremium) {
        clientiPremium.add(clientPremium);
    }

}
