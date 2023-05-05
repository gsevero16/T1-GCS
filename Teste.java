import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {
    @Test
    public void testarObterVencedor() {
        int[] jogadasJogador1 = { 1, 2, 3 };
        int[] jogadasJogador2 = { 2, 3, 1 };

        int resultadoEsperado = 1;
        int resultadoAtual = Main.obterVencedor(jogadasJogador1, jogadasJogador2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testarEmpate() {
        int[] jogadasJogador1 = { 1, 2, 3 };
        int[] jogadasJogador2 = { 3, 2, 1 };

        int resultadoEsperado = 0;
        int resultadoAtual = Main.obterVencedor(jogadasJogador1, jogadasJogador2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
