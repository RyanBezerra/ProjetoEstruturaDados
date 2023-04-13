public class Disciplina {
    private String nome;
    private double nota;
    private Disciplina proxima;

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.proxima = null;
    }

    public void setProxima(Disciplina disciplina) {
        this.proxima = disciplina;
    }

    public Disciplina getProxima() {
        return this.proxima;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
