import java.util.Arrays;

public class Gra {
    private int id;
    private String tytul;
    private String developer;
    private double cena;
    private String[] gatunki;

    public Gra(int id, String tytul, String developer, double cena, String[] gatunki) {
        this.id = id;
        this.tytul = tytul;
        this.developer = developer;
        this.cena = cena;
        this.gatunki = gatunki;
    }

    public Gra(int id, String tytul){
        this(id, tytul, "Nieznany", 25.0, new String[]{"Inny"});
    }

    public String getRodzaj(){
        return "Ogólny";
    }

    public int getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public String getDeveloper() {
        return developer;
    }

    public double getCena() {
        return cena;
    }

    public String[] getGatunki() {
        return gatunki;
    }

    public void setCena(double cena) {
        if (cena < 0) throw new IllegalArgumentException("Cena nie moze byc ujemna");
        this.cena = cena;
    }

    @Override
    public String  toString() {
        return "Gra{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", developer='" + developer + '\'' +
                ", cena=" + cena +
                ", gatunki=" + Arrays.toString(gatunki) +
                '}';
    }
}
