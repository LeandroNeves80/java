import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;     // distancia
        double Y;  // consumo
        double consumoMedio;


        X = teclado.nextInt();
        Y = teclado.nextDouble();

        consumoMedio = X / Y;

        System.out.printf("%.3f km/l\n", consumoMedio);

    }

}