
package Exercicio;


public class Navio {

    protected String matricula, nome;//Matricula do Navio (String), nome (String) e comprimento (float)
    protected float comprimento;

    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.comprimento = comprimento;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

}
