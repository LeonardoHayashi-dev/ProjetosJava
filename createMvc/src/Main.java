import javax.swing.*;

public class Main {

    // O método 'main' é a porta de entrada. O computador começa a ler o programa por aqui.
    public static void main(String[] args) {

        // O 'SwingUtilities.invokeLater' é uma boa prática.
        // Ele coloca a abertura da janela na fila correta do computador para evitar travamentos.
        SwingUtilities.invokeLater(() -> {

            // Criamos o objeto da nossa tela (instanciamos a classe CadastroView).
            // 'tela' é o nome que damos para essa janela específica na memória.
            cadastroView tela = new cadastroView();

            // Faz com que a janela apareça exatamente no centro da tela do computador.
            // O valor 'null' indica que ela não deve ficar "grudada" em nenhuma outra janela.
            tela.setLocationRelativeTo(null);

            // Torna a janela visível. Por padrão, no Java, as janelas começam escondidas.
            tela.setVisible(true);

        });
    }
}
