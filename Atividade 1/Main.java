public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("José");
        Vendedor vendedor = new Vendedor("James");
        Gerente gerente = new Gerente("Ana");

        Produto produto = new Produto("Pão", 10, "0,25", "Trigo");

        Vendas pedido = new Vendas(cliente, gerente, vendedor, produto);

        System.out.println("---Cliente----------------------");
        System.out.println(cliente.nome);

        System.out.println("---Vendedor----------------------");
        System.out.println(vendedor.nome);

        System.out.println("---Gerente----------------------");
        System.out.println(gerente.nome);

        System.out.println("---Produto----------------------");
        produto.info();

        System.out.println("---Venda----------------------");
        pedido.vendaFinalizada();

        System.out.println("-------------------------");
    }
}
