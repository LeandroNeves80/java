import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C; resultado;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        System.out.println("Digite os valores dos lados do triangulo:");

        if ((A + B > C) && (B + C > A) && (C + A > B)){
            resultado = A + B + C;
            System.out.println()
        }
    }
}