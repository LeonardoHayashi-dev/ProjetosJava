public class Cliente {



       // Atributos selecionados através da abstração

 private String nome;

 private String cpf;

 private String endereco;



// Construtor para inicializar o cliente com os dados necessários

 public Cliente(String nome, String cpf, String endereco) {

 this.nome = nome;

 this.cpf = cpf;

 this.endereco = endereco;

 }



 // Métodos Getter e Setter (opcional, para acessar os dados)

 public String getNome() {

   return nome;

 }



 public void setNome(String nome) {

 this.nome = nome;

 }



 public String getCpf() {

  return cpf;

 }



 public void setCpf(String cpf) {

 this.cpf = cpf;

 }



 public String getEndereco() {

 return endereco;

 }



 public void setEndereco(String endereco) {

  this.endereco = endereco;

  }



  // Método para exibir os dados do cliente

  public void exibirDados() {

   System.out.println("--- Dados do Cliente ---");

   System.out.println("Nome: " + nome);

   System.out.println("CPF: " + cpf);

   System.out.println("Endereço: " + endereco);

     }

    }
