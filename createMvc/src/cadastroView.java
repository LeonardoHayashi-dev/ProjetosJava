import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.util.Calendar;

public class cadastroView extends JFrame {

    // Instância do repositório (Certifique-se que o nome da classe está correto: ClienteRepository)
    private clienteRepository repository = new clienteRepository();

    // Componentes de Interface
    private JTextField txtId = new JTextField(5);
    private JTextField txtNome = new JTextField(30);
    private JFormattedTextField txtData;
    private JTextField txtIdade = new JTextField(5);
    private JTextField txtEmail = new JTextField(30);
    private JComboBox<String> cbSexo = new JComboBox<>(new String[]{"Masculino", "Feminino", "Outro"});
    private JTextArea areaLista = new JTextArea(15, 65);

    public cadastroView() {
        // Configuração da Máscara de Data
        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            txtData = new JFormattedTextField(mascaraData);
        } catch (ParseException e) {
            txtData = new JFormattedTextField();
        }

        // Configurações da Janela
        setTitle("Sistema de Cadastro - Versão Estável");
        setSize(850, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);

        // Estilo do campo idade (somente leitura)
        txtIdade.setEditable(false);
        txtIdade.setBackground(new Color(235, 235, 235));

        // =========================
        // PAINEL DE FORMULÁRIO
        // =========================
        JPanel painelCampos = new JPanel(new GridBagLayout());
        painelCampos.setBorder(new TitledBorder("Dados do Cliente"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        adicionar(painelCampos, new JLabel("ID:"), gbc, 0, 0);
        adicionar(painelCampos, txtId, gbc, 1, 0);
        adicionar(painelCampos, new JLabel("Nome:"), gbc, 0, 1);
        adicionar(painelCampos, txtNome, gbc, 1, 1);
        adicionar(painelCampos, new JLabel("Nascimento:"), gbc, 0, 2);
        adicionar(painelCampos, txtData, gbc, 1, 2);
        adicionar(painelCampos, new JLabel("Idade:"), gbc, 0, 3);
        adicionar(painelCampos, txtIdade, gbc, 1, 3);
        adicionar(painelCampos, new JLabel("E-mail:"), gbc, 0, 4);
        adicionar(painelCampos, txtEmail, gbc, 1, 4);
        adicionar(painelCampos, new JLabel("Gênero:"), gbc, 0, 5);
        adicionar(painelCampos, cbSexo, gbc, 1, 5);

        // Gatilho para calcular idade ao sair do campo data
        txtData.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                calcularIdade();
            }
        });

        // =========================
        // PAINEL DE BOTÕES
        // =========================
        JPanel painelBotoes = new JPanel(new FlowLayout());
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnConsultar = new JButton("Consultar");
        JButton btnAlterar = new JButton("Salvar Alteração");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnListar = new JButton("Atualizar Lista");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnConsultar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnListar);

        JPanel topo = new JPanel(new BorderLayout());
        topo.add(painelCampos, BorderLayout.CENTER);
        topo.add(painelBotoes, BorderLayout.SOUTH);
        add(topo, BorderLayout.NORTH);

        // Área de Listagem
        areaLista.setFont(new Font("Monospaced", Font.PLAIN, 12));
        areaLista.setEditable(false);
        add(new JScrollPane(areaLista), BorderLayout.CENTER);

        // Configura as ações passando os botões
        configurarAcoes(btnCadastrar, btnConsultar, btnAlterar, btnExcluir, btnListar);

        setVisible(true);
        txtId.requestFocus();
    }

    // =========================
    // MÉTODOS AUXILIARES
    // =========================

    private void adicionar(JPanel p, JComponent c, GridBagConstraints g, int x, int y) {
        g.gridx = x;
        g.gridy = y;
        p.add(c, g);
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtData.setValue(null);
        txtIdade.setText("");
        txtEmail.setText("");
        cbSexo.setSelectedIndex(0);
        txtId.requestFocus();
    }

    private void calcularIdade() {
        try {
            String dataStr = txtData.getText().replace("/", "").trim();
            if (dataStr.length() == 8) {
                int anoNasc = Integer.parseInt(dataStr.substring(4, 8));
                int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
                txtIdade.setText(String.valueOf(anoAtual - anoNasc));
            }
        } catch (Exception e) {
            txtIdade.setText("");
        }
    }

    private void configurarAcoes(JButton btnC, JButton btnCons, JButton btnA, JButton btnD, JButton btnL) {

        // CADASTRAR
        btnC.addActionListener(e -> {
            if (txtNome.getText().trim().isEmpty()) return;
            Cliente c = new Cliente(txtNome.getText(), txtData.getText(), txtEmail.getText(), (String) cbSexo.getSelectedItem());
            repository.adicionar(c);
            btnL.doClick(); // Atualiza a lista automaticamente
            limparCampos();
        });

        // LISTAR
        btnL.addActionListener(e -> {
            areaLista.setText(String.format("%-5s | %-20s | %-20s | %-5s\n", "ID", "NOME", "EMAIL", "IDADE"));
            areaLista.append("-------------------------------------------------------------\n");
            int i = 0;
            for (Cliente c : repository.buscarTodos()) {
                areaLista.append(String.format("%-5d | %-20s | %-20s | %-5s\n", i, c.getNome(), c.getEmail(), txtIdade.getText()));
                i++;
            }
        });

        // CONSULTAR
        btnCons.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                Cliente c = repository.buscarPorId(id);
                if (c != null) {
                    txtNome.setText(c.getNome());
                    txtData.setText(c.getDataNasc()); // Verifique se o método é getDataNasc ou getDataNascimento
                    txtEmail.setText(c.getEmail());
                    cbSexo.setSelectedItem(c.getSexo());
                    calcularIdade();
                } else {
                    JOptionPane.showMessageDialog(this, "ID não encontrado!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID inválido!");
            }
        });

        // ALTERAR
        btnA.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                Cliente atualizado = new Cliente(txtNome.getText(), txtData.getText(), txtEmail.getText(), (String) cbSexo.getSelectedItem());
                repository.atualizar(id, atualizado);
                JOptionPane.showMessageDialog(this, "Cliente ID " + id + " atualizado!");
                btnL.doClick();
                limparCampos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao alterar!");
            }
        });

        // EXCLUIR
        btnD.addActionListener(e -> {
            try {
                repository.remover(Integer.parseInt(txtId.getText()));
                btnL.doClick();
                limparCampos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir!");
            }
        });
    }
}