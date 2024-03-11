import java.util.Scanner;

public class Exercicio1 {

    public static void executar() {
      
      //Int num = Prompt.lerInteiro("Digite um número: ");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        leitor.close();

        if (num>10) {
            System.out.println("O número é maior que 10!");
        } else{
            System.out.println("O número é menor que 10!");
        }

    }

}
