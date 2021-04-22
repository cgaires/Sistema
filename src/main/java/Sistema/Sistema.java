package Sistema;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        String nomeDefinido = "--- Nome não registrado ainda ---";

        int menuConvertido = 0;

        while (menuConvertido != 3) {

        System.out.println("Digite o número da opção desejada:\n1. Ainda não possuo cadastro\n2. Já possuo cadastro\n3. Sair");

        Scanner menuRegistrar = new Scanner(System.in);

        String menuRegistrado = menuRegistrar.nextLine();

        menuConvertido = Integer.parseInt(menuRegistrado);

            if (menuConvertido == 1) {

                System.out.println("Qual o seu nome?");

                Scanner nomeRegistrar = new Scanner(System.in);

                String nomeRegistrado = nomeRegistrar.nextLine();

                System.out.println("Nome registrado com sucesso\nVoltando ao menu...\n");

                nomeDefinido = nomeRegistrado;

            } else if (menuConvertido == 2) {
                System.out.println("Seu nome é " + nomeDefinido + "\n");
            } else if (menuConvertido ==3) {
                System.out.println("Saindo do sistema...\nAté logo :)");

            } else {
                System.out.println("Opção inválida, por favor tente novamente digitando apenas os números apresentados no menu\n");
            }
        }
    }
}