import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira o "+ (i + 1) + " número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("vetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
