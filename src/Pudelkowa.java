public class Pudelkowa extends Gra{
    private String edycja;

    public Pudelkowa(int id, String tytul, String developer, double cena, String[] gatunki, String edycja) {
        super(id, tytul, developer, cena, gatunki);
        this.edycja = edycja;
    }

    @Override
    public String toString() {
        return "Pudelkowa{" +
                "edycja='" + edycja + '\'' +
                '}';
    }
}
