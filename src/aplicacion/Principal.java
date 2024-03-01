package aplicacion; 
import dominio.Aproximacion;
public class Principal {
    public static void main(String[] args) {
        int totalDardos = 1000;
        double piAproximado = Aproximacion.aproximarPi(totalDardos);
        System.out.println("Aproximación de pi lanzando " + totalDardos + " dardos: " + piAproximado);
    }
    
}
