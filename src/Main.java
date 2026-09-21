import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        double somaNotas = 0;
        alunos.add(new Aluno("João", 20, 8.5));
        alunos.add(new Aluno("Maria", 22, 9.0));
        alunos.add(new Aluno("Pedro", 19, 7.5));
        alunos.add(new Aluno("Ana", 21, 8.0));
        alunos.add(new Aluno("Lucas", 23, 9.5));
        Aluno alunoMaiorNota = alunos.get(0);
        Aluno alunoMenorNota = alunos.get(0);
        System.out.println("Lista de Alunos");
        for (Aluno aluno : alunos) {
            System.out.println("Nome:"+aluno.getNome());
        }
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        double mediaTurma = somaNotas / alunos.size();
        System.out.printf("Média das notas da turma: %.2f", mediaTurma);
        for (Aluno aluno : alunos) {
            if (aluno.getNota() > alunoMaiorNota.getNota()) {
                alunoMaiorNota = aluno;
            }
            if (aluno.getNota() < alunoMenorNota.getNota()) {
                alunoMenorNota = aluno;
            }
        }
        System.out.println("\nAluno com maior nota:" + alunoMaiorNota.getNome() + " Nota:"+ alunoMaiorNota.getNota());
        System.out.println("Aluno com menor nota:" + alunoMenorNota.getNome() + " Nota: " + alunoMenorNota.getNota());
        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return Double.compare(a2.getNota(), a1.getNota());
            }
        });
        System.out.println("Alunos Ordenados por ordem decresente de nota:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome:"+aluno.getNome() +" Nota:"+aluno.getNota());
        }
    }
}