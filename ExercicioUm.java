    import java.util.Scanner;

    public class ExercicioUm{

    public static void main(String[] args) {

        int valorInserido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMAÇÃO DE SOLUCÕES COMPUTACIONAIS");
        System.out.println("           TERCEIRA LISTA             ");


    
        System.out.println("\nDê uma nota entre 0 e 10: ");
        valorInserido = scanner.nextInt();

        while (valorInserido > 10 || valorInserido < 0){
          
        System.out.println("A nota inserida não está de acordo com os parâmetros.");   
        System.out.println("Por favor, digite uma nota entre 0 e 10. ");  

        System.out.println("Dê uma nota entre 0 e 10: ");
        valorInserido = scanner.nextInt();
        }
        System.out.println("\nObrigado pela avaliação. ");  
        scanner.close();
    }
}