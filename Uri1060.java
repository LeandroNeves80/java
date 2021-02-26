import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N;
        int qtde=0; // preciso ter valor inicial para poder acrescentar +1

        for (int cont = 1; cont <=6; cont++){  // contando ate 6
            N = teclado.nextFloat();
            if (N >0){
                qtde = qtde + 1;
            }
        }

        System.out.println(qtde + " valores positivos");
    }
}