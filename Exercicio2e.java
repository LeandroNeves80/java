import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double basemaior, basemenor, altura, area, intermediario;

        System.out.println("Digite a base maior");
        basemaior = teclado.nextDouble();

        System.out.println("Digite agora a base menor");
        basemenor = teclado.nextDouble();

        System.out.println("Por fim, digite a altura");
        altura = teclado.nextDouble();

        intermediario = (basemaior + basemenor) * altura;
        area = intermediario / 2;
        System.out.println("Area do Trapézio = " + area);


    }

}