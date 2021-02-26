import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, qtdHoras;
        float valorHora, salario;

        num = teclado.nextInt();
        qtdHoras = teclado.nextInt();
        valorHora = teclado.nextFloat();

        salario = qtdHoras * valorHora;

        System.out.println("NUMBER = " +num);
        System.out.printf("SALARY = U$ %.2f\n" , salario);

    
    }
}