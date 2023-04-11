import java.util.ArrayList;

public class ListaAlunos {
    private ArrayList<String> alunos;

    public ListaAlunos() {
        alunos = new ArrayList<String>();
    }

    public void adicionarAluno(String rgm, String nome) {
        String aluno = rgm + " - " + nome;
        alunos.add(aluno);
    }

    public String buscarAluno(String rgm) {
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            String alunoRgm = aluno.split(" - ")[0];
            if (alunoRgm.equals(rgm)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String rgm) {
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            String rgmAluno = aluno.split(" - ")[0];
            if (rgmAluno.equals(rgm)) {
                alunos.remove(i);
                return true;
            }
        }
        return false;
    }

    public String[] getRGMs() {
        String[] rgms = new String[alunos.size()];
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            String rgm = aluno.split(" - ")[0];
            rgms[i] = rgm;
        }
        return rgms;
    }

    public ArrayList<String> getAlunos() {
        return alunos;
    }
}

