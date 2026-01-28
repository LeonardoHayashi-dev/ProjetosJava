public class Cliente {
    // variaveis para guardar os dados do cliente
    private String nome;
    private String dataNasc;
    private String email;
    private String sexo;

    //construtor é chamado quando ciramos um "novo cliente"
    public Cliente(String nome, String dataNasc, String email, String sexo) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.sexo = sexo;

    }

    // Metodos "GETTERS" para pegar as informaçoes dentro do objeto
    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    @Override  //sobreposição de metodo ( função no java )
    public String toString() { // função java toString que converte qualquer valor em string.
        return "Nome: " + nome + " Nasc: " + " Email: " + email + " Sexo: " + sexo;
    }

}
