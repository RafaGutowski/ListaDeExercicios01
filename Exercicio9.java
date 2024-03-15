import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor A: ");
        int a = sc.nextInt();
        System.out.println("Digite um valor B: ");
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("Os valores são iguais");
        } else if (a>b) {
            System.out.println("O valor de A é maior que o de B");
       } else  {
        System.out.println("O valor de B é maior que o de A");
       }
    }
}
