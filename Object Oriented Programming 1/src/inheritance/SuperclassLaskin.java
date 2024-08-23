package inheritance;
public class SuperclassLaskin {
	protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected double tulos;

    
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }
    
    public void setTulos(double tulos) {
        this.tulos = tulos;
    }

    public double getTulos() {
        return tulos;
    }
    public void tulostaTulos() {
        System.out.println("Laskun tulos on: " + tulos);
    }
}

