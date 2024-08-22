package encapsulation;

public class Laskin {

    private double luku1;
    private double luku2;
    private double tulos;

 
    public void setLuku1(double luku1) {
        this.luku1 = luku1;
    }

    public void setLuku2(double luku2) {
        this.luku2 = luku2;
    }

  
    public double getTulos() {
        return tulos;
    }

   
    public void laskeYhteen() {
        this.tulos = luku1 + luku2;
    }

    public void vahennys() {
        this.tulos = luku1 - luku2;
    }

    public void kerto() {
        this.tulos = luku1 * luku2;
    }

    public void jako() {
        try {
            if (luku2 == 0 || luku1 == 0) {
                throw new ArithmeticException("Nollalla ei voi jakaa.");
            }
            this.tulos = luku1 / luku2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            this.tulos = Double.NaN;
        }
    }
}
