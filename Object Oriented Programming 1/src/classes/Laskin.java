package classes;

public class Laskin {

    double luku1;
    double luku2;
    static double tulos = 0;

    public double laskeYhteen() {
        return luku1 + luku2;
    }


    public double vahennys() {
        return luku1 - luku2;
    }


    public double kerto() {
        return luku1 * luku2;
    }


    public double jako() {
        try {
        	if (luku2==0 || luku1==0) {throw new ArithmeticException("Nollalla ei voi jakaa.");
        }
            return luku1 / luku2;
        } catch (ArithmeticException e) { System.out.println(e.getMessage());
        return Double.NaN;
        }
    }
}