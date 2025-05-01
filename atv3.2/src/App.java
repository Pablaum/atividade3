import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int maior = Integer.MIN_VALUE; 
        int indiceMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("digite o numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }
        System.out.println("o maior valor é: " + maior);
        System.out.println("está na posição " + indiceMaior);
    }
}
