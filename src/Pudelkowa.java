public class Pudelkowa extends Gra{
    private String edycja;

    public Pudelkowa(String tytul, String developer, double cena, String[] gatunki, String edycja) {
        super(tytul, developer, cena, gatunki);
        this.edycja = edycja;
    }

    //Tak samo jak w klasie cyfrowa, została użyta komenda super.toString aby kod został zoptymalizowany i zamiast pisać od nowa cały toString zostaje wykorzystany on z klasy Gra i są dodane do niego tylko informacje o edycji gry
    @Override
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
