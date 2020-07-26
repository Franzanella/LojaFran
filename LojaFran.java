public class LojaFran {
    public static void main(String[] args) {
        CarrinhoNome c = new CarrinhoNome();
        Produto p1 = new Produto("Lapis", 1.40);
        c.adicionar(p1);
        c.adicionar(new Produto("AA", 2.40));
        c.adicionar(new Produto("Caneta", 0.7));
        Produto buscado = c.buscarNome("Caneta");
        buscado.mostrarInfo();
    }
}