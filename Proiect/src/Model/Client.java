package model;

public class Client {
    private int id;
    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private String parola;

    public Client(int id, String nume, String prenume, String email, String telefon, String parola) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.telefon = telefon;
        this.parola = parola;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getParola() {
        return parola;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }

}
