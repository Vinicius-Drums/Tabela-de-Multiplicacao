import java.util.Scanner;

public class TabelaMultiplicacao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número N
        System.out.print("Insira um número N para a tabela de multiplicação: ");
        int n = scanner.nextInt();

        // Imprime a tabela de multiplicação de 1 a 10 para o número N
        System.out.println("Tabela de Multiplicação para " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
