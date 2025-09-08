import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteka {
    //wykorzystanie Arraylist do przechowywania listy gier
    private ArrayList<Gra> gras = new ArrayList<>();

    //Metoda dodająca grę do listy
    public void dodaj(Gra gra){
        gras.add(gra);
    }
    //Metoda wypisująca wszystkie gry
    public ArrayList<Gra> getAll() {
        return gras;
    }
    public Gra findbyid(int id){
        for (Gra x : gras) {
            if (x.getId() == id) return x;
        }
        return null;
    }
    //Metoda aktualizująca cenę gry
    public void UpdateCena(int id, double NowaCena){
        Gra y = findbyid(id);
        if(y != null) {
            y.setCena(NowaCena);
        }
        else {
            throw new IllegalArgumentException("Nie znaleziono gry o podanym ID.");
        }
    }
    //Metoda usuwająca grę z listy
    public void usun(int id){
        Gra y = findbyid(id);
        if(y != null){
            gras.remove(y);
        }
        else {
            throw new IllegalArgumentException("Nie znaleziono gry o podanym ID.");
        }
    }
}
