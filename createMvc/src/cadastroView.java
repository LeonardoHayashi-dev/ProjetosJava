import javax.swing.*;
import java.awt.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class cadastroView extends JFrame {
    private JTextField txtNome = new JTextField(30);
    private JFormattedTextField txtData;
    private JTextField txtEmail = new JTextField(30);
    private JComboBox<String> cbSexo = new JComboBox<>(new String[]{"Masculino", "Feminino", "Outro"});
    private JTextArea areaLista = new JTextArea(10, 40);

    public cadastroView() {
        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####"); // Ajustei para 4 dígitos no ano
            mascaraData.setPlaceholderCharacter('_');
            txtData = new JFormattedTextField(mascaraData);
            txtData.setColumns(8);
        } catch (ParseException e) {
            txtData = new JFormattedTextField();
            e.printStackTrace(); // É bom imprimir o erro para saber o que houve
        }

// Criando a Janela de Cadastro

        setTitle("Sistema de Cadastro - Time ");

        setSize(650, 550);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

//Criar o painel onde vai ficar as caixas de texto


    }
}