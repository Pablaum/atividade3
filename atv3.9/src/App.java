import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);

        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6];
        int tamanhoC = 0;

        System.out.println("insira os 6 números do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        System.out.println("insira os 6 números do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    boolean jaExiste = false;
                    for (int k = 0; k < tamanhoC; k++) {
                        if (C[k] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        C[tamanhoC] = A[i];
                        tamanhoC++;
                    }
                }
            }
        }
        System.out.println("elementos comuns aos vetores A e B:");
        if (tamanhoC == 0) {
            System.out.println("nenhum elemento em comum.");
        } else {
            for (int i = 0; i < tamanhoC; i++) {
                System.out.print(C[i] + " ");
            }
        }

        scanner.close();
    }
}
