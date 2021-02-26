public class Continhas{
    public static void main(String args[]){
        int a,b,c;

        a = 10;
        b = 7;

        c = a + b;
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subt = " + c);

        c = a * b;
        System.out.println("Valor da mult = " + c);

        c = a / b;
        System.out.println("Valor da div = " + c);

        c = a % b;   // aqui eu pego o resto da divisao de 10 por 7
        System.out.println("Valor do resto = " + c);

        float d;
        d = (float)a / b;

        System.out.println("Valor da vivisao real = " + d);

        d = 10.0f/3;
        System.out.println("Valor da divisao = " + d);



    }
}