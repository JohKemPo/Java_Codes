package composicao.MuitosParaMuitos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jonas");
        Aluno a2 = new Aluno("Barb");
        Aluno a3 = new Aluno("Amanda");

        Curso c1 = new Curso("Java");
        Curso c2 = new Curso("Python");
        Curso c3 = new Curso("LoL");
        

        c1.addAluno(a1);
        c1.addAluno(a2);
        c1.addAluno(a3);

        c2.addAluno(a3);

        a1.addCurso(c3);
        a1.addCurso(c2);
       // a1.addCurso(c1);

        for(Aluno aluno: c1.alunos){
            System.out.println(aluno.nome);
        }
        System.out.println(a1.cursos.get(0).alunos);
    }
}
