package inheritance;

class Erikoislaskut extends SuperclassLaskin {

    public void neliöjuuri() {
        if (a >= 0) {
            tulos = Math.sqrt(a);
        } else {
            System.out.println("Virhe, negatiivinen luku.");
        }
    }

    public void pii() {
        tulos = Math.PI;
    }

    public void nopeus(double matka, double aika) {
        if (aika != 0) {
            tulos = matka / aika;
        } else {
            System.out.println("Nollalla ei voi jakaa.");
        }
    }
}