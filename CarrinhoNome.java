import java.util.HashMap;
import java.util.Map.Entry;

public class CarrinhoNome {
    private HashMap<String,Produto> produtos;

    public CarrinhoNome(){
        this.produtos = new HashMap<String,Produto>();

    }

    public void adicionar(Produto produto){
        produtos.put(produto.getNome(), produto);

    }

    public void remover(String nome){
        produtos.remove(nome);
    }

    public Produto buscarNome(String nome){
        return produtos.get(nome);
    }

    public void listar(){
        for (Entry<String,Produto> registro : produtos.entrySet()){
            registro.getValue().mostrarInfo();
        }
    }
}