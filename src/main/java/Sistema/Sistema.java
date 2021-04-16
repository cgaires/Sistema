package Sistema;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        System.out.println("Olá!\nDigite o número da opção desejada:\n1. Ainda não possuo cadastro\n2. Já possuo cadastro\n3. Sair");

        Scanner menuRegistrar = new Scanner(System.in);

        String menuRegistrado = menuRegistrar.nextLine();


        if (menuRegistrado.equals("1")) {

            System.out.println("Qual o seu nome?");

            Scanner nomeRegistrar = new Scanner(System.in);

            String nomeRegistrado = nomeRegistrar.nextLine();
        }
        else if(menuRegistrado.equals("2")){
            System.out.println("Seu nome é " + menuRegistrado);
        }
        else {
            System.out.println("Saindo do sistema...\nAté logo :)");
        }
    }
}