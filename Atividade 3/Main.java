public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marquinhos");
        Carro carro = new Carro("ENDURANCE ", 2022, "Toro");
        Locadora locadora = new Locadora("Top Cars");

        Locacao locacao = new Locacao(carro, cliente, locadora, "100$", "1 semana");

        System.out.println("---Informações----------------------");
        locacao.info();
        System.out.println("-------------------------");
    }
}
