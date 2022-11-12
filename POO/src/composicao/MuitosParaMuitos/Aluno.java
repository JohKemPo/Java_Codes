package composicao.MuitosParaMuitos;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();
    /*
     * ERsse final serve para fixar o endereço na memoria porem permitindo a alteração do conteudo.
     */

    Aluno(String nome){
        this.nome = nome;
    }

    void addCurso(Curso curso){ // IDA E VOLTA 
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString(){
        return nome;
    }
}
