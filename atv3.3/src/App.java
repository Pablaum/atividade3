import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];
        int quantidadePares = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println("quantidade de número par: " + quantidadePares);

        scanner.close();
    }
}

