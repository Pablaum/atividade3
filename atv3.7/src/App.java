import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            int[] vetor = new int[15];
    
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("insira o " + (i + 1) + " número: ");
                vetor[i] = scanner.nextInt();
            }
    
            System.out.print("insira o número que deseja contar: ");
            int numero = scanner.nextInt();
            int contador = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == numero) {
                    contador++;
                }
            }
    
            System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");
    
            scanner.close();
        }
    }
