package daoservices;

import dao.ClientDao;
import model.Client;

public class ClientRepositoryService {

    ClientDao clientDao;

    public ClientRepositoryService() {
        clientDao = new ClientDao();
    }

    public Client getClientById(int id) {
        Client client = clientDao.read(id);
        if (client != null) {
            System.out.println(client);
        } else {
            System.out.println("Clientul cu id-ul " + id + " nu exista");
        }
        return client;
    }

    public void addClient(Client client) {
        clientDao.create(client);
    }

    public void deleteClient(int id) {
        Client client = getClientById(id);
        if (client != null) {
            clientDao.delete(client);
            System.out.println("Clientul cu id-ul " + id + " a fost sters");
        }
    }

}
