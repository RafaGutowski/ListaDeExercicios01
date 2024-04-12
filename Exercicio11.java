import java.util.Scanner;

public class Exercicio11 {

    public static void executar(){

        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite primeiro número: ");
        int num = sc.nextInt();
        System.out.println("Digite segundo número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num2 = sc.nextInt();

        if (num>num1) {
            int temp = num;
            num = num1;
            num1 = temp;
        }
        if (num1>num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num>num1) {
            int temp = num;
            num = num1;
            num1 = temp;
        }
    }
}
