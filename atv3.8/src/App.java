import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10]; 
                System.out.println("insira os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        System.out.println("insira os do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i]; 
        }
        for (int i = 0; i < B.length; i++) {
            C[i + A.length] = B[i]; 
        }
        System.out.println("vetor c ):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        scanner.close();
    }
}
