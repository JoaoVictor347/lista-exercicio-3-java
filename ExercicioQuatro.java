import java.util.Scanner;

public class ExercicioQuatro{

     public static void main(String[] args) {

        int n1, n2, n3, n4, n5, soma, media;
            
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMAÇÃO DE SOLUCÕES COMPUTACIONAIS");
        System.out.println("         TERCEIRA LISTA");

        System.out.println("\nInsira o primeiro número aqui: ");
        n1 = scanner.nextInt();

        System.out.println("\nInsira o segundo número aqui: ");
        n2 = scanner.nextInt();

        System.out.println("\nInsira o terceiro número aqui: ");
        n3 = scanner.nextInt();

        System.out.println("\nInsira o quarto número aqui: ");
        n4 = scanner.nextInt();

        System.out.println("\nInsira o quinto número aqui: ");
        n5 = scanner.nextInt();


        soma = (n1 + n2+ n3+ n4+ n5);
        media = (n1 + n2+ n3+ n4+ n5) /5;

        System.out.println("\nA soma dos números é: " + soma);
        System.out.println("\nA média dos números é: " + media);

        System.out.println("\nObrigado");
        
        scanner.close();
    }
}