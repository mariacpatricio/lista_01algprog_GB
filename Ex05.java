import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        
        int celsius;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor em Celsius: ");
        celsius = leia.nextInt();

        double fah = 1.8 * (celsius) + 32;

        System.out.println("O valor em Fahrenheit é: " + fah);

        leia.close();
    }
    
}
