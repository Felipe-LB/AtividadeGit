import java.util.Scanner;

public class AtividadeUm {

    //Exercício 1 – Calculadora com Menu
    //Crie um programa que exiba um menu:
    //1 - Soma
    //2 - Subtração
    //3 - Multiplicação
    //4 - Divisão
    //0 - Sair
    //O programa deve:
    //Ler a opção do usuário
    //Pedir dois números
    //Executar a operação escolhida
    //Exibir o resultado
    //Repetir até o usuário escolher 0 (sair)
    //⚠️ Regras:
    //Não permitir divisão por zero Validar opção inválida

    public static void main(String[] args) {

        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt(); //

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado!");
        sc.close();
    }
}