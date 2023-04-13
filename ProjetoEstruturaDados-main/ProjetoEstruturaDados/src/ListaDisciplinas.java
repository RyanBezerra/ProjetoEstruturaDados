public class ListaDisciplinas {
    private Disciplina primeira;

    public ListaDisciplinas() {
        this.primeira = null;
    }

    public void adicionarDisciplina(String nome, double nota) {
        Disciplina novaDisciplina = new Disciplina(nome, nota);
        if (primeira == null) {
            primeira = novaDisciplina;
        } else {
            Disciplina atual = primeira;
            while (atual.getProxima() != null) {
                atual = atual.getProxima();
            }
            atual.setProxima(novaDisciplina);
        }
    }

    public void mostrarDisciplinas() {
        Disciplina atual = primeira;
        int i = 1;
        while (atual != null) {
            System.out.println(i + ". " + atual.getNome() + " - Nota: " + atual.getNota());
            atual = atual.getProxima();
            i++;
        }
    }
}
