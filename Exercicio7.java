import java.util.Scanner;

public class Exercicio7 {

    public static void executar() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        if(num1 >= 100|| num1 <= 200) {
            System.out.println("O número digitado está entre 100 e 200.");
        } else if (num1 <= 100|| num1 >= 200 ) {
            System.out.println("O número digitado não está entre 100 e 200.");
        }
    }

}
