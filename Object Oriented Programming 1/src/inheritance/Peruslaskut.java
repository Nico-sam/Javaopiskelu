package inheritance;

class Peruslaskut extends SuperclassLaskin {

    public void plus() {
        tulos = a + b;
    }

    public void miinus() {
        tulos = a - b;
    }

    public void kerto() {
        tulos = a * b;
    }

    public void jako() {
        if (b != 0) {
            tulos = a / b;
        } else {
            System.out.println("Nollalla ei voi jakaa.");
        }
    }
}