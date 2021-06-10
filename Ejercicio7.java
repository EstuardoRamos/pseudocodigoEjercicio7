
import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        int edad, numAleatorio, nPar = 0, nImpar = 0, nCero = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            numAleatorio = (int) (Math.random() * 36);
            System.out.println(numAleatorio);
            if (numAleatorio % 2 == 0) {
                nPar += 1;
            } else if (numAleatorio == 0) {
                nCero += 1;
            } else {
                nImpar += 1;
            }

        }
        double porPar = nPar * (6.66666);
        double porCero = nCero * (6.66666);
        float porImpar = (float) (nImpar * (6.66666));
        System.out.println("-----------------");
        System.out.println("El porcentaje de numeros par es " + porPar + " %");
        System.out.println("El porcentaje de numeros impar es " + porImpar + " %");
        System.out.println("El porcentaje de ceros es " + porCero + " %");

    }

}

