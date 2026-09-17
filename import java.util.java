import java.util.Scanner;

public class MaioresDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas;
        int maiores = 0;

        System.out.print("Digite a quantidade de pessoas: ");
        quantidadePessoas = scanner.nextInt();

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                maiores++;
            }
        }

        System.out.println("Quantidade de maiores de idade: " + maiores);

        scanner.close();
    }
}