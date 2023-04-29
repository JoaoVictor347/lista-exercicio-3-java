import java.util.Scanner;

public class ExercicioDois {
    
    public static void main(String[] args) {

        String loginUsuario ,senhaUsuario;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMAÇÃO DE SOLUCÕES COMPUTACIONAIS");
        System.out.println("           TERCEIRA LISTA             ");
        System.out.println("           Exercício dois             ");


        System.out.println("\nPara efetuar login é necessário que se faça um cadastro:");

        do {
    
        System.out.println("Insira o login de usuário:");
        loginUsuario = scanner.nextLine();

        System.out.println("Agora, insira a senha desejada:");
        senhaUsuario = scanner.nextLine();
            
            if (loginUsuario.equals(senhaUsuario)){

             System.out.println("A senha e usuário não podem ser iguais:");
             System.out.println("Insira as informações novamente");

             }
             System.out.println("\nSenha e usuário foram cadastrados com sucesso.");
        } while(senhaUsuario.equals(loginUsuario));
        scanner.close();
    }
}
