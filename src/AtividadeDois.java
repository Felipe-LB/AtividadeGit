import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para saque: ");
        int valor = scanner.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("\nNotas utilizadas:");
        for (int nota : notas) {
            int quantidade = valor / nota;
            valor = valor % nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$" + nota);
            }
        }
        scanner.close();
    }
}