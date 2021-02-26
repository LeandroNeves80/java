import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, MEDIA, AA, BB;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        AA = (A * 3.5) / 11;
        BB = (B * 7.5) / 11;
        
        MEDIA = AA + BB;

        System.out.printf("MEDIA = %.5f\n", MEDIA);
        
    }
}