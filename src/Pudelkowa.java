public class Pudelkowa extends Gra{
    private String edycja;

    public Pudelkowa(String tytul, String developer, double cena, String[] gatunki, String edycja) {
        super(tytul, developer, cena, gatunki);
        this.edycja = edycja;
    }


   public String toString() {
        return "Pudelkowa{" +
                "id=" + getId() +
                ", tytul='" + getTytul() + '\'' +
                ", developer='" + getDeveloper() + '\'' +
                ", cena=" + getCena() +
                ", gatunki=" + Arrays.toString(getGatunki()) +
                ", edycja='" + edycja + '\'' +
                '}';
    }
}
