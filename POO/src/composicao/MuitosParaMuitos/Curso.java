package composicao.MuitosParaMuitos;
import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }

    void addAluno(Aluno aluno){ // IDA E VOLTA 
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
