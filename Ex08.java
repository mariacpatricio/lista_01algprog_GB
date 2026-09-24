import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Digite a largura do primeiro cômodo:");
      double largura1 = leia.nextDouble();
      
      System.out.println("Digite o comprimento do primeiro cômodo:");
      double comprimento1 = leia.nextDouble();
      
      double area1 = (largura1) * (comprimento1);
      
      System.out.println("A área do primeiro cômodo é: " + area1 + "m2");
      
      System.out.println("Digite a largura do segundo cômodo:");
      double largura2 = leia.nextDouble();
      
      System.out.println("Digite o comprimento do segundo cômodo:");
      double comprimento2 = leia.nextDouble();
      
      double area2 = (largura2) * (comprimento2);
      
      System.out.println("A área do segundo cômodo é: " + area2 + "m2");
      
      System.out.println("Digite a largura do terceiro cômodo:");
      double largura3 = leia.nextDouble();
      
      System.out.println("Digite o comprimento do terceiro cômodo:");
      double comprimento3 = leia.nextDouble();
      
      double area3 = (largura3) * (comprimento3);
      
      System.out.println("A área do terceiro cômodo é: " + area3 + "m2");
      
      
      double areaTotal = (area1 + area2 + area3);
      
      System.out.println("A área total é: " + areaTotal + "m2");
      
      leia.close();
     
    }
}
