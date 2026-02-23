import java.util.ArrayList;
import java.util.List;

public class clienteRepository {

    private List<Cliente> listaClientes = new ArrayList<>();

    public void adicionar(Cliente c) {
        listaClientes.add(c);
    }

    public List<Cliente> buscarTodos() {
        return listaClientes;
    }

    public void remover(int id) {
        if (id >= 0 && id < listaClientes.size()) {
            listaClientes.remove(id);
        }
    }

    public void atualizar(int id, Cliente c) {
        if (id >= 0 && id < listaClientes.size()) {
            listaClientes.set(id, c);
        }
    }

    // Método essencial para a consulta funcionar
    public Cliente buscarPorId(int id) {
        if (id >= 0 && id < listaClientes.size()) {
            return listaClientes.get(id);
        }
        return null;
    }
}
