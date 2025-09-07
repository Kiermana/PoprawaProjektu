public class Cyfrowa extends Gra{
    private String platforma;

    public Cyfrowa(String tytul, String developer, double cena, String[] gatunki, String platforma) {
        super(tytul, developer, cena, gatunki);
        this.platforma = platforma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "platforma=' " + platforma + '\'' +
                '}';
    }
}
