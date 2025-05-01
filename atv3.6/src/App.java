import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("insira o " + (i + 1) + " número: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.print("insira o número que deseja remover: ");
        int numeroRemover = scanner.nextInt();
        boolean removido = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroRemover) {
                for (int j = i; j < vetor.length - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                removido = true;
                break; 
                 }
            }
          if (removido) {
            System.out.println("vetor após a remoção:");
            for (int i = 0; i < vetor.length - 1; i++) {
                System.out.print(vetor[i] + " ");
            }
         } else {
            System.out.println("número não encontrado no vetor.");
        }

        scanner.close();
    }
}
