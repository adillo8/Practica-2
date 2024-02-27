package dominio;
import java.util.Random;
public class Aproximacion {
    
    public static double aproximarPiRecursivo(int dardosRestantes, int dardosDentroCirculo) {
        // no quedan más dardos para lanzar
        if (dardosRestantes == 0) {
            return ((double) dardosDentroCirculo); // Retornar cantidad de dardos dentro del círculo
        } else {
            // Generar puntos aleatorios x e y
            Random r = new Random();
            double x = r.nextDouble();
            double y = r.nextDouble();

            // Verificar si el punto está dentro del círculo con la fórmula x^2 + y^2 <= 1
            if (x * x + y * y <= 1) {
                dardosDentroCirculo++;
            }
            // Llamada recursiva con un dardo menos, problema más pequeño misma naturaleza
            return aproximarPiRecursivo(dardosRestantes - 1, dardosDentroCirculo);
        }
    }

    public static double aproximarPi(int totalDardos) {
        int dardosDentroCirculo = 0;
        double dardosDentro = aproximarPiRecursivo(totalDardos, dardosDentroCirculo);
        return 4 * (dardosDentro / totalDardos);
    }


}




