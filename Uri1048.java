import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, reajuste, novosalario;
        int percentual;

        salario = teclado.nextFloat();

        if (salario <=400.00f){
            percentual = 15;
        }
        else if (salario <= 800.00f){
            percentual = 12;
        }
        else if (salario <= 1200.00f){
            percentual = 10;
        }
        else if (salario <= 2000.00f){
            percentual = 7;
        }
        else{
            percentual = 4;
        }

        reajuste = salario * percentual / 100;
        novosalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novosalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }
}