public class Semestre {
  Aluno aluno;
  Professor professor;
  Diretor diretor;
  Materias materias;
  Notas nota;
  int semestre;

  public Semestre(Aluno aluno, Professor professor, Materias materias, Notas nota, int semestre) {
    this.aluno = aluno;
    this.professor = professor;
    this.materias = materias;
    this.nota = nota;
    this.semestre = semestre;
  }

  public void info() {

    System.out.println("Aluno " + aluno.nome + " do semestre " + this.semestre +
        ", tirou " + nota.nota + " na disciplinda de " + materias.materia + " do professor(a) " + professor.nome);
  }
}
