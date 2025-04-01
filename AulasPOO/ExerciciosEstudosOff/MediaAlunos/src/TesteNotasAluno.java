import java.util.Scanner;

public class TesteNotasAluno {

    public static String cadastradoAluno(Scanner scanf) {
        System.out.print("Digite o nome do aluno: ");
        return scanf.nextLine();
    }

    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        String[] alunoNome = new String[5];

        
        for (int i = 0; i < 5; i++) {
            alunoNome[i] = cadastradoAluno(scanf);
            gerenciador.adicionarAluno(alunoNome[i]);
        }

        scanf.close();

        System.out.println("Tem alunos cadastrados agora? " + gerenciador.temAlunos());
        System.out.println("Quantidade de alunos: " + gerenciador.quantidadeDeAlunos());

        Aluno alunoBuscado = gerenciador.buscarAlunoPorId(1);
        if (alunoBuscado != null) {
            System.out.println("Aluno encontrado: " + alunoBuscado.getName());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
