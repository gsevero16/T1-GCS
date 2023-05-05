import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o número de rodadas: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int jogador1Pontos = 0;
            int jogador2Pontos = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Vez do jogador 1:");
                int player1Number = sc.nextInt();

                System.out.println("Vez do jogador 2:");
                int player2Number = sc.nextInt();

                if (player1Number > player2Number) {
                    jogador1Pontos++;
                } else if (player2Number > player1Number) {
                    jogador2Pontos++;
                }
            }

            System.out.println("Jogador 1 venceu " + jogador1Pontos + " rodadas e Jogador 2 venceu " + jogador2Pontos + " rodadas.");
        }

        sc.close();
    }
}
