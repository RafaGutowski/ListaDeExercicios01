import java.util.Scanner;

public class Exercicio8 {

    public static void executar() {
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int i = sc.nextInt();

        if (i>=50) {
            System.out.println("O número digitado é maior ou igual a 50.");
        } else{
            System.out.println("O número digitado é menor que 50.");
        }

    }

}
