public class Vendas {
  Cliente cliente;
  Gerente gerente;
  Vendedor vendedor;
  Produto produto;

  public Vendas(Cliente cliente, Gerente gerente, Vendedor vendedor, Produto produto) {
    this.gerente = gerente;
    this.cliente = cliente;
    this.produto = produto;
    this.vendedor = vendedor;
  }

  public void vendaFinalizada() {

    System.out.println("Venda de " + produto.nome + ", com preço de " + produto.preco +
        ", para o cliente: " + cliente.nome + ", pelo vendedor " + vendedor.nome);
  }
}
