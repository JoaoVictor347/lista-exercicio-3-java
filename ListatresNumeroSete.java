import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        int numerosPares = 0;
        int numerosImpares = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
        
        scanner.close();
    }
}