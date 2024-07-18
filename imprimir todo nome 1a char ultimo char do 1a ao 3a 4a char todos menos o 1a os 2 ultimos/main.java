import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEntre com nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nTodo nome: " + nome);
        System.out.println("\nPrimeiro caractere: " + nome.charAt(0));
        System.out.println("\nÚltimo caractere: " + nome.charAt(nome.length() - 1));
        System.out.println("\nPrimeiro ao terceiro caractere: " + nome.substring(0, Math.min(3, nome.length())));
        if (nome.length() > 3) {
            System.out.println("\nQuarto caractere: " + nome.charAt(3));
        }
        System.out.println("\nTodos menos o primeiro: " + nome.substring(1));
        if (nome.length() > 1) {
            System.out.println("\nOs dois últimos: " + nome.substring(nome.length() - 2));
        }
    }
}
