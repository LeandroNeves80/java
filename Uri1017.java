import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int vel, tempo;
        double consumo;

        tempo = teclado.nextInt();
        vel  = teclado.nextInt();

        consumo = (double)tempo / 12 * vel;

        System.out.printf("%.3f\n",consumo);
    }
}