// importanto a biblioteca arrayList para armazenar os dados do cliente

import java.util.ArrayList;

public class clienteRepository {
    //Cria uma lista (ArrayList) que vai guardar os objetos do tipo cliente
    private ArrayList<Cliente> ListadeClientes;

    // método para adicionar o cliente na lista
    public void adicionar(Cliente cliente) {
        ListadeClientes.add(cliente);
    }

    // metodo para devolver a lista para quem pedir
    public ArrayList<Cliente> buscartodos() {
        return ListadeClientes;
    }

    //metodo para remover um cliente
    public void remover(int index) {
        if (index >= 0 && index < ListadeClientes.size()) {
            ListadeClientes.remove(index);
        }
    }

}
