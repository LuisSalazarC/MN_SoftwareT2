package tema2;

import java.util.ArrayList;

public class csMetodos {
    
    public ArrayList <csFilaBiseccion> Biseccion (int iteraciones, double xi, double xs, double errorDeseado){
        
        ArrayList <csFilaBiseccion> lista  = new ArrayList <csFilaBiseccion>();
        double errorCalculado = 1;
        int i = 0;
        double b;
        boolean solucion = false;
        double f1 = this.funcionBiseccion(xi);
        double f2 = this.funcionBiseccion(xs);
        
        if(f1 * f2 < 0){
            solucion = true;
        }else{
            solucion = false;
        }
        
        if(solucion){
            while(i < iteraciones && errorCalculado > errorDeseado){
                csFilaBiseccion fila = new csFilaBiseccion();
                fila.setI(i);
                fila.setXi(xi);
                fila.setXs(xs);
                double xr = (fila.getXi() + fila.getXs()) / 2;
                fila.setXr(xr);
                fila.setFxi(this.funcionBiseccion(fila.getXi()));
                fila.setFxr(this.funcionBiseccion(fila.getXr()));
                fila.setSigno(fila.getFxi() * fila.getFxr());
                
                if(fila.getSigno() < 0){
                    b = xs;
                    xs = fila.getXr();
                }else{
                    b = xi;
                    xi = fila.getXr();
                }
                
                if(i > 0){
                    errorCalculado = this.calcularError(fila.getXr(), b);
                    fila.setErrorCalculado(errorCalculado);
                }else{
                    fila.setErrorCalculado(errorCalculado);
                }
                
                lista.add(fila);
                i++;
                //System.out.println( fila.toString());
            }
        }else{
            lista = null;
        }
        return lista;
    }
    
    /*public ArrayList <csFilaSecante> Secante (int iteraciones, double xim, double xi, double errorDeseado){
        ArrayList <csFilaSecante> lista = new ArrayList <csFilaSecante>();
        double errorCalculado = 1, b, fxi = this.funcionNewtonSecante(xi), fxim = this.funcionNewtonSecante(xim), raiz = this.calcularRaizSecante(xi, fxi, xim, fxim);
        int i = 0;
        while(i < iteraciones && errorDeseado < errorCalculado){
            csFilaSecante fila = new csFilaSecante();
            fila.setI(i);
            fila.setXi(xi);
            fila.setXim(xim);
            fila.setFxim(this.funcionNewtonSecante(fila.getXim()));
            fila.setFxi(this.funcionNewtonSecante(fila.getXi()));
            fila.setRaiz(this.calcularRaizSecante(fila.getXi(), fila.getFxi(), fila.getXim(), fila.getFxim()));
            b = fila.getXi();
            fila.setErrorCalculado(this.calcularError(fila.getRaiz(), b));
            xim = fila.getXi();
            xi = fila.getRaiz();
            lista.add(fila);
            i++;
            System.out.println( fila.toString());
        }
        return lista;
    }*/
    
    public ArrayList <csFilaNewton> Newton (int iteraciones, double xi, double errorDeseado){
        ArrayList <csFilaNewton> lista = new ArrayList <csFilaNewton>();
       double errorCalculado = 1, b, fxi = this.funcionNewtonSecante(xi), fdxi = this.funcionDerivadaNewton(xi), raiz = this.calcularRaizNewton(xi, fxi, fdxi);
        int i = 0;
        while(i < iteraciones && errorDeseado < errorCalculado){
            csFilaNewton fila = new csFilaNewton();
            fila.setI(i);
            fila.setXi(xi);
                
            fila.setFxi(this.funcionNewtonSecante(fila.getXi()));
            fila.setFdxi(this.funcionDerivadaNewton(fila.getXi()));
            fila.setRaiz(this.calcularRaizNewton(fila.getXi(), fila.getFxi(), fila.getFdxi()));
            b = fila.getXi();
            fila.setErrorCalculado(this.calcularError(fila.getRaiz(), b));
            
            xi = fila.getRaiz();
            lista.add(fila);
            i++;
            System.out.println( fila.toString());
        }
        return lista;
    }
    
    public ArrayList <csFilaPunto> Punto (int iteraciones, double xi, double errorDeseado){
        ArrayList <csFilaPunto> lista = new ArrayList <csFilaPunto>();
       double errorCalculado = 1, b, x = this.funcionDespejadaPunto(xi);
        int i = 0;
        while(i < iteraciones && errorDeseado < errorCalculado){
            csFilaPunto fila = new csFilaPunto();
            fila.setI(i);
            fila.setXi(xi);
                
            fila.setX(this.funcionDespejadaPunto(fila.getXi()));
            
            b = fila.getXi();
            fila.setErrorCalculado(this.calcularError(fila.getX(), b));
            
            xi = fila.getX();
            lista.add(fila);
            i++;
            System.out.println( fila.toString());
        }
        return lista;
    }
    
    private double funcionBiseccion(double x){
        return Math.pow(x, 2) - 0.9 * x - 1.52;
    }
    
    private double calcularError(double actual, double anterior){
        return Math.abs((actual-anterior)/actual);
    }
       
    
    private double funcionNewtonSecante(double x){
        return Math.pow(Math.E, -x) - x;
    }
    private double funcionDerivadaNewton (double x){
        return -Math.pow(Math.E, -x) - 1;
    }
     private double funcionDespejadaPunto (double x){
        return Math.pow(Math.E, -x);
    }
    private double calcularRaizSecante(double xi, double fxi, double xim, double fxim){
        double numerador, denominador;
        numerador = (fxi * (xim-xi));
        denominador = fxim - fxi;
        return xi - (numerador / denominador);
    }
    private double calcularRaizNewton(double xi, double fxi, double fdxi){
        double numerador, denominador;
        numerador = fxi;
        denominador = fdxi;
        return xi -(numerador/denominador);
    }
}
