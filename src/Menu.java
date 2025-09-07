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

            String wybor = scanner.nextInt();

            try {
                switch (wybor) {
                    case 1 :
                            dodajGre();
                            break;

                case 2 :
                        pokazGry();
                        break;

                    case 3 :
                        ZmienCene();
                        break;

                    case 4:
                        UsunGre();
                        break;

                    case 5 :
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
        System.out.println("Podaj id: ");
    }
}
