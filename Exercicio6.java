import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double Celsius = sc.nextInt();

        double Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("A temperatura " + Celsius + "° é em Fahrenheit: " + Fahrenheit + "°.");

    }
    
}
