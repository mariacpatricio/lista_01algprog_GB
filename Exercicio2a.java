import java.util.Scanner;
public class Exercicio2a {
public static void main(String[] args) {
    
double boleto1;
double boleto2;
double boleto3;
double boleto4;

double salarioBruto;

Scanner veja = new Scanner(System.in);

System.out.println("Digite o valor do primeiro boleto");
boleto1 = veja.nextDouble();

System.out.println("Digite o valor do segundo boleto");
boleto2 = veja.nextDouble();

System.out.println("Digite o valor do terceiro boleto");
boleto3 = veja.nextDouble();

System.out.println("Digite o valor do quarto boleto");
boleto4 = veja.nextDouble();

double totalBoletos = (boleto1 + boleto2 + boleto3 + boleto4);
System.out.println("O valor total a ser pago é R$" + totalBoletos);

System.out.println("Digite o valor do seu salário bruto:");
salarioBruto = veja.nextDouble();

double desconto = (salarioBruto * 0.14);
double salarioLiquido = (salarioBruto) - (desconto);

System.out.println("Seu salário líquido é R$: " + salarioLiquido);

double valorFalta = (salarioLiquido) - (totalBoletos);

if (salarioLiquido < totalBoletos) {
System.out.println("O salário não é o suficiente para o pagamento, faltou R$: " + valorFalta);
}

else {

    System.out.println("Pagamento realizado. O saldo restante é R$: " + valorFalta);
}

veja.close();

}
}