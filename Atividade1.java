import java.util.Scanner;

public class Atividade1 {

    public static void main(String args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura em centímetros:");
        int altura = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade < 18){
            System.out.println(nome + " tem " + idade + " anos e " + altura / 100 + " de altura");
            System.out.println(nome + " é menor de idade");
        }
        else if (idade <= 0)
        {
            System.out.println("Idade inválida!");
        }
        else
        {
            System.out.println(nome + " tem " + idade + " anos e " + altura / 100 + " de altura");
            System.out.println(nome + " é menor de idade");
        }
    }
}
