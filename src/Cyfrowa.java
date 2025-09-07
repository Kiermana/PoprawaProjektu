public class Cyfrowa extends Gra{
    private String platforma;

    public Cyfrowa(int id, String tytul, String developer, double cena, String[] gatunki, String platforma) {
        super(id, tytul, developer, cena, gatunki);
        this.platforma = platforma;
    }

    @Override
    public String toString() {
        return "Cyfrowa{" +
                "platforma='" + platforma + '\'' +
                '}';
    }
}
