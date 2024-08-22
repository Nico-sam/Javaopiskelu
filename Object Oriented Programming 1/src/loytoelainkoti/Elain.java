package loytoelainkoti;

import java.time.LocalDate;

public class Elain {
    private String elainlaji;
    private String elainrotu;
    private int ika;
    private LocalDate saapumispaiva;
    private LocalDate luovutuspaiva;
    private String misc;

    // Getters and Setters
    public String getElainlaji() {
        return elainlaji;
    }

    public void setElainlaji(String elainlaji) {
        this.elainlaji = elainlaji;
    }

    public String getElainrotu() {
        return elainrotu;
    }

    public void setElainrotu(String elainrotu) {
        this.elainrotu = elainrotu;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public LocalDate getSaapumispaiva() {
        return saapumispaiva;
    }

    public void setSaapumispaiva(LocalDate saapumispaiva) {
        this.saapumispaiva = saapumispaiva;
    }

    public LocalDate getLuovutuspaiva() {
        return luovutuspaiva;
    }

    public void setLuovutuspaiva(LocalDate luovutuspaiva) {
        this.luovutuspaiva = luovutuspaiva;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    @Override
    public String toString() {
        return  
                "Laji='" + elainlaji + '\'' +
                ", Rotu='" + elainrotu + '\'' +
                ", Ikä=" + ika +
                ", Saapumispäivä=" + saapumispaiva +
                ", Luovutuspäivä=" + (luovutuspaiva != null ? luovutuspaiva : "Ei viela luovutettu") +
                ", Muuta tietoa='" + misc + '\'' +
                '}';
    }
}