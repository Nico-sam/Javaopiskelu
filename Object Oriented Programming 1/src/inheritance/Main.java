package inheritance;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Peruslaskut perusLaskin = new Peruslaskut();
			Erikoislaskut erikoisLaskin = new Erikoislaskut();
			Tallenna tallenna = new Tallenna("laskutoimitukset.txt");
			String uusiLaskutoimitus = null;

			do {
			    System.out.println("Valitse laskutoimitus:");
			    System.out.println("1: Yhteenlasku");
			    System.out.println("2: Vähennyslasku");
			    System.out.println("3: Kertolasku");
			    System.out.println("4: Jakolasku");
			    System.out.println("5: Neliöjuuri");
			    System.out.println("6: Piin arvo");
			    System.out.print("Syötä valintasi (1-6): ");
			    int valinta = scanner.nextInt();

			    String laskutoimitus = "";
			    double tulos = 0;

			    switch (valinta) {
			        case 1:
			            System.out.print("Syötä ensimmäinen luku (a): ");
			            perusLaskin.setA(scanner.nextDouble());
			            System.out.print("Syötä toinen luku (b): ");
			            perusLaskin.setB(scanner.nextDouble());
			            perusLaskin.plus();
			            laskutoimitus = perusLaskin.getA() + " + " + perusLaskin.getB();
			            tulos = perusLaskin.getTulos();
			            System.out.println("Yhteenlaskun tulos: " + tulos);
			            break;
			        case 2:
			            System.out.print("Syötä ensimmäinen luku (a): ");
			            perusLaskin.setA(scanner.nextDouble());
			            System.out.print("Syötä toinen luku (b): ");
			            perusLaskin.setB(scanner.nextDouble());
			            perusLaskin.miinus();
			            laskutoimitus = perusLaskin.getA() + " - " + perusLaskin.getB();
			            tulos = perusLaskin.getTulos();
			            System.out.println("Vähennyslaskun tulos: " + tulos);
			            break;
			        case 3: 
			            System.out.print("Syötä ensimmäinen luku (a): ");
			            perusLaskin.setA(scanner.nextDouble());
			            System.out.print("Syötä toinen luku (b): ");
			            perusLaskin.setB(scanner.nextDouble());
			            perusLaskin.kerto();
			            laskutoimitus = perusLaskin.getA() + " * " + perusLaskin.getB();
			            tulos = perusLaskin.getTulos();
			            System.out.println("Kertolaskun tulos: " + tulos);
			            break;
			        case 4:
			            System.out.print("Syötä ensimmäinen luku (a): ");
			            perusLaskin.setA(scanner.nextDouble());
			            System.out.print("Syötä toinen luku (b): ");
			            perusLaskin.setB(scanner.nextDouble());
			            perusLaskin.jako();
			            laskutoimitus = perusLaskin.getA() + " / " + perusLaskin.getB();
			            tulos = perusLaskin.getTulos();
			            System.out.println("Jakolaskun tulos: " + tulos);
			            break;
			        case 5:
			            System.out.print("Syötä luku neliöjuurilaskua varten: ");
			            erikoisLaskin.setA(scanner.nextDouble());
			            erikoisLaskin.neliöjuuri();
			            laskutoimitus = "√" + erikoisLaskin.getA();
			            tulos = erikoisLaskin.getTulos();
			            System.out.println("Neliöjuuren tulos: " + tulos);
			            break;
			        case 6:
			            erikoisLaskin.pii();
			            laskutoimitus = "π";
			            tulos = erikoisLaskin.getTulos();
			            System.out.println("Piin arvo: " + tulos);
			            break;
			        default:
			            System.out.println("Virheellinen valinta, yritä uudelleen.");
			            continue;
			    }


			    tallenna.tallennaLaskutoimitus(laskutoimitus, tulos);
			    tallenna.ilmoitus();
			    
			    System.out.print("Uusi laskutoimitus? (kyllä/ei): ");
			    uusiLaskutoimitus = scanner.next();
			} while (uusiLaskutoimitus.equalsIgnoreCase("kyllä"));
		}
        System.out.println("Moro!");
    }
}