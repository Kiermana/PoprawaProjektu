import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Biblioteka biblioteka;

    public Menu(Biblioteka biblioteka) {
        this.biblioteka = biblioteka;
    }

    public void start(){
        boolean menu = true;

        while (menu) {
            System.out.println("Biblioteka gier");
            System.out.println("1: Dodaj gre");
            System.out.println("2: Wyswietl liste gier");
            System.out.println("3: Zmien cene gry");
            System.out.println("4: usun gre.");
            System.out.println("5: wyjscie");

            String wybor = scanner.nextLine();

            try {
                switch (wybor) {
                    case "1" :
                            dodajGre();
                            break;

                case "2" :
                        pokazGry();
                        break;

                    case "3" :
                        ZmienCene();
                        break;

                    case "4":
                        UsunGre();
                        break;

                    case "5" :
                        menu = false;
                        break;

                    default:
                        System.out.println("Nieprawidlowa opcja");
                }

            }catch (Exception e) {
                System.out.println("Blad: " + e.getMessage());
            }
        }
    }
    private void dodajGre() {
        System.out.println("Tytul: ");
        String tytul = scanner.nextLine();

        System.out.println("Producent: ");
        String developers = scanner.nextLine();

        double cena = -1;
        while (cena < 0) {
            System.out.print("Cena: ");
            try {
                cena = scanner.nextDouble();
                if (cena < 0) {
                    System.out.println("Blad: podana cena jest ujemna.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Blad: nie zostala podana liczba.");
                scanner.nextLine();
            }
        }
        System.out.println("Podaj gatunki (oddziel je znakiem ,): ");
        String[] gatunki = scanner.nextLine().split(",");

        System.out.println("Rodzaj gry (C = cyfrowa, P = Pudelkowa");
        String rodzaj = scanner.nextLine().toUpperCase();

        if(rodzaj.equals("C")) {
            System.out.println("Podaj platforme (np: steam, epic games, gog");
            String platforma = scanner.nextLine();
            biblioteka.dodaj(new Cyfrowa(tytul, developers, cena, gatunki, platforma));
        }
        else if (rodzaj.equals("P")){
            System.out.println("Podaj Edycje (np Podstawowa, Deluxe, Ultimate");
            String edycja = scanner.nextLine();
            biblioteka.dodaj(new Pudelkowa(tytul, developers, cena, gatunki, edycja));
        }
        else {
            System.out.println("Zostal podany zly typ gry");
        }
        System.out.println("Gra zostala dodana");
    }

    private void pokazGry(){
        if (biblioteka.getAll().isEmpty()){
            System.out.println("Brak gier w bibliotece");
        }
        else {
            for (Gra y : biblioteka.getAll()){
                System.out.println(y);
            }
        }
    }

    private void ZmienCene() {
        System.out.println("Podaj ID gry: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nowa cena: ");
        double cena = Double.parseDouble(scanner.nextLine());
        biblioteka.UpdateCena(id, cena);
        System.out.println("Cena gry zostala zmieniona");
    }
    private void UsunGre(){
        System.out.println("Podaj ID gry: ");
        int id = Integer.parseInt(scanner.nextLine());
        biblioteka.usun(id);
        System.out.println("Gra zostala usunieta z systemu.");
    }
}
