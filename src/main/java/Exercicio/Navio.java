
package Exercicio;

/**
 *
 * @author Asus
 */
public class Navio {

    /**
     *
     */
    protected String matricula, 

    /**
     *
     */
    nome;//Matricula do Navio (String), nome (String) e comprimento (float)

    /**
     *
     */
    protected float comprimento;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     */
    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.comprimento = comprimento;
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;

    }

}
