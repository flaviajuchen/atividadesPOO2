public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("José");
        Diretor diretor = new Diretor("Will");
        Professor professor = new Professor("Leticia");
        Professor coordenador = new Professor("Rafael");
        Notas notas = new Notas(10);
        Materias materia = new Materias("P.O.O");
        Semestre semestre = new Semestre(aluno, professor, materia, notas, 2);

        System.out.println("---Diretor----------------------");
        System.out.println(diretor.nome);

        System.out.println("---Coordenador----------------------");
        System.out.println(coordenador.nome);

        System.out.println("---Informações----------------------");
        semestre.info();

        System.out.println("-------------------------");
    }
}
