import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args){

        String pessoa, sexo, estadoCivil;
        int idade;
        float salario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMAÇÃO DE SOLUCÕES COMPUTACIONAIS");
        System.out.println("           TERCEIRA LISTA             ");


         // Nome 
         do{ 
            System.out.println("Escreva o nome da pessoa: ");
            pessoa = scanner.nextLine();

            if (pessoa.length() <= 3){
                System.out.println("\nO nome inserido deve conter mais que 3 caracteres:");
            }

         }while ( pessoa.length() <= 3);

         // Idade
            do{ 
            System.out.println("Escreva a idade: ");
            idade = scanner.nextInt();

            if (idade > 150 || idade < 0 ){
                System.out.println("\nA idade inserida não esta de acordo com os parametros internos.");
                System.out.println("\nTente novamente.");
            }
        }while ((idade > 150 || idade < 0 ));


        // Salario
        do{ 
            System.out.println("Informe o seu salário: ");
            salario = scanner.nextInt();

            if (salario <= 0 ){
                System.out.println("\nO salário informado deve ser maior que R$ 0,00.");
                System.out.println("\nTente novamente.");
            }
          
        }while ((salario < 0));

                // sexo

        do{ 
            System.out.println("Informe o sexo: ");
            sexo = scanner.next();

            if (!sexo.equals("f") && !sexo.equals("m")){
                System.out.println("\nO campo deve ser preenchido com ''f'' ou ''m''.");
                System.out.println("\nTente novamente.");
               
            }
          
        }while (!sexo.equals("f") && !sexo.equals("m"));

            // Estado civil

        do{ 
            System.out.println("Informe o estado civil: ");
            scanner.nextLine();
            estadoCivil = scanner.nextLine();

           if (!estadoCivil.equals("s")){
           } else if (!estadoCivil.equals("c")){
           } else if (!estadoCivil.equals("v")){
           } else if (!estadoCivil.equals("d")){
            System.out.println("\nO campo deve ser preenchido com ''s'', ''c'' ''v'', ''d''.");
            System.out.println("\nTente novamente.");
           }
        }while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));
        System.out.println("\nobrigado por se cadastrar!");
        scanner.close();
    } 
 }  

