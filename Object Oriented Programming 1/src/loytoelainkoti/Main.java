package loytoelainkoti;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elain e = new Elain();


        System.out.print("Syötä eläinlaji: ");
        e.setElainlaji(scanner.nextLine());

        System.out.print("Syötä rotu: ");
        e.setElainrotu(scanner.nextLine());


        while (true) {
            try {
                System.out.print("Syötä eläimen ikä: ");
                e.setIka(Integer.parseInt(scanner.nextLine()));
                break; 
            } catch (NumberFormatException ex) {
                System.out.println("Virheellinen syöte. Anna ikä numerona.");
            }
        }


        while (true) {
            try {
                System.out.print("Aseta saapumispäivä muodossa (YYYY-MM-DD): ");
                e.setSaapumispaiva(LocalDate.parse(scanner.nextLine()));
                break; 
            } catch (DateTimeParseException ex) {
                System.out.println("Virheellinen päivämäärä. Käytä muotoa YYYY-MM-DD.");
            }
        }


        while (true) {
            try {
                System.out.print("Aseta luovutuspäivä muodossa (YYYY-MM-DD) tai jätä tyhjäksi, jos ei ole vielä luovutettu: ");
                String luovutusInput = scanner.nextLine().trim();
                if (luovutusInput.isEmpty()) {
                    e.setLuovutuspaiva(null);
                    break;
                } else {
                    e.setLuovutuspaiva(LocalDate.parse(luovutusInput));
                    break; 
                }
            } catch (DateTimeParseException ex) {
                System.out.println("Virheellinen päivämäärä. Käytä muotoa YYYY-MM-DD.");
            }
        }


        System.out.print("Muuta lisättävää? ");
        e.setMisc(scanner.nextLine());


        System.out.println("\nTässä on syöttämäsi tiedot:");
        System.out.println(e.toString());


        System.out.print("\nHaluatko tallentaa tiedot tiedostolle? (kyllä/ei): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("kyllä")) {
            saveToFile(e);
            System.out.println("Tieto tallennettu tiedostoon.");
        } else {
            System.out.println("Jatketaan tallentamatta.");
        }

        scanner.close();
    }

    private static void saveToFile(Elain e) {
        int entryNumber = getLastEntryNumber() + 1; // Get the last number and increment by 1

        try (FileWriter writer = new FileWriter("elain_info.txt", true)) {
            writer.write(entryNumber + ". " + e.toString() + "\n");
        } catch (IOException ex) {
            System.out.println("Tallentaessa tapahtui virhe.");
            ex.printStackTrace();
        }
    }

    // Helper method to get the last entry number from the file
    private static int getLastEntryNumber() {
        int lastNumber = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("elain_info.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Find the last line's number
                if (line.matches("\\d+\\.\\s.*")) {
                    int currentNumber = Integer.parseInt(line.split("\\.")[0]);
                    if (currentNumber > lastNumber) {
                        lastNumber = currentNumber;
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Virhe tiedostoa lukiessa.");
            ex.printStackTrace();
        }

        return lastNumber;
    }
}

