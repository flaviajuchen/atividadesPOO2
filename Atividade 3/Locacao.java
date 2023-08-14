public class Locacao {
  Cliente cliente;
  Locadora locadora;
  Carro carro;
  String tempo;
  String preco;

  public Locacao(Carro carro, Cliente cliente, Locadora locadora, String preco, String tempo) {
    this.carro = carro;
    this.locadora = locadora;
    this.cliente = cliente;
    this.tempo = tempo;
    this.preco = preco;
  }

  public void info() {

    System.out.println("O cliente " + cliente.nome + " alugou o carro " + carro.nome + ", " + carro.modelo +
        " ano " + carro.ano + " da locadora " + locadora.nome + " para " + this.tempo + " pelo valor de " + this.preco);
  }
}
