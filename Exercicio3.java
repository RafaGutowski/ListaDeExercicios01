import java.util.Scanner;

public class Exercicio3 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = leitor.nextInt();
        leitor.close();

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        int B = leitor1.nextInt();
        leitor1.close();

        if (A>B) {
            System.out.println("O número " + A + " é maior que " + B);
        } else if (B>A){
            System.out.println("O número " + B + " é maior que " + A);
        } else {
            System.out.println("O número " + B + " é igual " + A);
        }
    }
    
}
