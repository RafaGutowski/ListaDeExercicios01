import java.util.Scanner;

public class Exercicio4 {
    
    public static void executar(){


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        leitor.close();

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        int num1 = leitor1.nextInt();
        leitor1.close();

        System.out.println("A soma entre os numeros digitados é: " + (num+num1));
        System.out.println("A subtração entre os numeros digitados é: " + (num-num1));
        System.out.println("A multiplicação entre os numeros digitados é: " + (num*num1));
        System.out.println("A divisão entre os numeros digitados é: " + (num/num1));
    }

}
