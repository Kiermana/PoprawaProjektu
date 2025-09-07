public class Cyfrowa extends Gra{
    private String platforma;

    public Cyfrowa(String tytul, String developer, double cena, String[] gatunki, String platforma) {
        super(tytul, developer, cena, gatunki);
        this.platforma = platforma;
    }

    @Override
    public String toString() {

        //Dzięki super.toString() nie trzeba wypisywac na nowo całego toString tylko można wykorzystać go z klasy Gra i rozszerzyć go o platformę
        return super.toString() +
                "platforma=' " + platforma + '\'' +
                '}';
    }
}
