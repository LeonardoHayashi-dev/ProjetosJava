import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CadastroProduto extends JFrame {

    // Vou começar fazendo os campos de texto
    private JTextField prodCodigo;
    private JTextField prodNome;
    private JTextField prodFabricante;
    private JTextField prodQuantidade;
    private JTextField prodCategoria;

    // Agora irei fazer os botôes do crud
    private JButton btnCadastrar;
    private JButton btnAtualizar;
    private JButton btnDeletar;
    private JButton btnAlterar;

    public CadastroProduto() {

        // aqui faço a configuração da janela
        setTitle("Sistema de Cadastro de Produtos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // fazendo o layout
        setLayout(new GridLayout(7, 2, 5, 5));

        // Adicionando os campos
        add(new JLabel("Código do Produto:"));
        prodCodigo = new JTextField();
        add(prodCodigo);

        add(new JLabel("Nome do Produto:"));
        prodNome = new JTextField();
        add(prodNome);

        add(new JLabel("Fabricante:"));
        prodFabricante = new JTextField();
        add(prodFabricante);

        add(new JLabel("Quantidade:"));
        prodQuantidade = new JTextField();
        add(prodQuantidade);

        add(new JLabel("Categoria:"));
        prodCategoria = new JTextField();
        add(prodCategoria);

        // Botões
        btnCadastrar = new JButton("Cadastrar");
        btnAtualizar = new JButton("Atualizar");
        btnDeletar = new JButton("Deletar");
        btnAlterar = new JButton("Alterar");

        add(btnCadastrar);
        add(btnAtualizar);
        add(btnDeletar);
        add(btnAlterar);

        // Fazendo os botões funcionarem
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarProduto();
            }
        });

        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarProduto();
            }
        });

        btnDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarProduto();
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarProduto();
            }
        });

        setVisible(true);
    }
    // Método para pegar os dados e verificar se eles são validos
    private boolean camposVazios() {
        return prodCodigo.getText().isEmpty() ||
                prodNome.getText().isEmpty() ||
                prodFabricante.getText().isEmpty() ||
                prodQuantidade.getText().isEmpty() ||
                prodCategoria.getText().isEmpty();
    }
    // Ação para cadastrar o produto
    private void cadastrarProduto() {
        if (camposVazios()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Produto cadastrado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Ação para atualização do produto
    private void atualizarProduto() {
        if (camposVazios()) {
            JOptionPane.showMessageDialog(this,
                    "Nenhum produto para atualizar!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Produto atualizado com sucesso!",
                    "Atualização",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Ação para alteração do produto
    private void alterarProduto() {
        if (camposVazios()) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um produto para alterar!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Produto alterado com sucesso!",
                    "Alteração",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Ação para deletar o produto
    private void deletarProduto() {
        prodCodigo.setText("");
        prodNome.setText("");
        prodFabricante.setText("");
        prodQuantidade.setText("");
        prodCategoria.setText("");

        JOptionPane.showMessageDialog(this,
                "Produto deletado com sucesso!",
                "Exclusão",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Método Principal para executar o programa
    public static void main(String[] args) {
        new CadastroProduto();
    }

}

