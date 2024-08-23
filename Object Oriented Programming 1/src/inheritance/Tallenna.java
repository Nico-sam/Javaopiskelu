package inheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tallenna {

    private String tiedostoNimi;

    public Tallenna(String tiedostoNimi) {
        this.tiedostoNimi = tiedostoNimi;
    }
    public void ilmoitus(){
    	System.out.println("Laskutoimitus on tallennettu tiedostoon: " + tiedostoNimi);
    }

    public void tallennaLaskutoimitus(String laskutoimitukset, double tulos) {
        try (FileWriter fileWriter = new FileWriter(tiedostoNimi, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(laskutoimitukset + " = " + tulos);
        } catch (IOException e) {
            System.out.println("Tiedostoon tallentaminen epäonnistui: " + e.getMessage());
        }
    }
}