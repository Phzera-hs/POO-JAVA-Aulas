import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunos {
    private List<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome) {
        Aluno novoAluno = new Aluno(nome);
        alunos.add(novoAluno);
        
        System.out.println("Aluno cadastrado: " + novoAluno.getName() + " (ID: " + novoAluno.getId() + ")");
    }

    public boolean temAlunos() {
        return !alunos.isEmpty();
    }

    public int quantidadeDeAlunos() {
        return alunos.size();
    }

    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
