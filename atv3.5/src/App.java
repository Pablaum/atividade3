import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];
        int soma = 0;
        int maiorQueMedia = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira o " + (i + 1) + " número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        double media = soma / (double) vetor.length;
        System.out.println("a média dos valores é: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                maiorQueMedia++;
            }
        }
        System.out.println("quantidade maiores que a média: " + maiorQueMedia);

        scanner.close();
    }
}
