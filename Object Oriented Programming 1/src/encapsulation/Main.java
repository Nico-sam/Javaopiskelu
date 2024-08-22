package encapsulation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            Laskin myObj2 = new Laskin(); 

            System.out.println("Syötä ensimmäinen numero: ");
            myObj2.setLuku1(myObj.nextDouble());

            System.out.println("Syötä toinen numero: ");
            myObj2.setLuku2(myObj.nextDouble());

            System.out.println("Valitse laskutoimitus:\n1) Yhteenlasku\n2) Vähennyslasku\n3) Kertolasku\n4) Jakolasku");
            int choice = myObj.nextInt();

            switch (choice) {
                case 1:
                    myObj2.laskeYhteen();
                    break;
                case 2:
                    myObj2.vahennys();
                    break;
                case 3:
                    myObj2.kerto();
                    break;
                case 4:
                    myObj2.jako();
                    break;
                default:
                    System.out.println("Virheellinen valinta");
                    return;
            }

            System.out.println("Tulokseksi saadaan: " + myObj2.getTulos());
        } catch (Exception e) {
            System.out.println("Oops. Nyt meni pieleen.");
        } finally {
            System.out.println("Ohjelma sulkeutuu.");
        }
    }
}
