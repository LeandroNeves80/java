import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Digite o valor da base");
        base = teclado.nextInt();

        System.out.println("Digite o valor da altura");
        altura = teclado.nextInt();

        area = (base * altura)/2;
        //System.out.println("O valor da area eh " + area);

        System.out.printf("O Valor da area do triangulo vale: %.3f\n", area);
        


    }
    
}