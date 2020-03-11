
package tema2;

public class csFilaPunto {
    
        
    private int i;
    private double xi, x, errorCalculado;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getErrorCalculado() {
        return errorCalculado;
    }

    public void setErrorCalculado(double errorCalculado) {
        this.errorCalculado = errorCalculado;
    }

    
    @Override
    public String toString() {
        return "csFilaNewton{" + "i=" + i + ", xi=" + xi + ", x=" + x + ",  errorCalculado=" + errorCalculado + '}';
    }
    
}
