import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        switch (num) {
            case 1: 
                System.out.println("Um");
                break;
            case 2:
                System.out.println( "Dois" );
                break;
            case 3: 
                System.out.println("Três");
                break;
            case 4: 
                System.out.println( "Quatro" );
                break;
            case 5:
                System.out.println( "Cinco" );
                break;
            default:
                System.out.println("O número digitado é invalido");
                break;
        }
    }

}
