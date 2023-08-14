public class Produto {
    String materia_prima;
    String nome;
    int estoque;
    String preco;

    public Produto(String nome, int estoque, String preco, String materia_prima) {
        this.nome = nome;
        this.preco = preco;
        this.materia_prima = materia_prima;
        this.estoque = estoque;
    }

    public void info() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", Estoque: " + estoque + ", Matéria Prima: "
                + materia_prima);
    }
}