import java.util.Scanner;
// observação: fiz essa atividade pelo replit, pois o terminal do vscode estava rodando o codigo da atv anterior (???)
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("insira 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("vetor ordenado em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

