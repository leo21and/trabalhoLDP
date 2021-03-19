
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
    public Navio(String matricula, String nome, float comprimento) {   // construtor
        this.matricula = matricula;
        this.comprimento = comprimento;
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {  //getter para a matricula
        return matricula;
    }

    /**
     *
     * @return
     */
    public float getComprimento() { //getter para comprimento
        return comprimento;
    }

    /**
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) { //setter para comprimento
        this.comprimento = comprimento;
    }

    /**
     *
     * @return
     */
    public String getNome() {   //getter para o nome
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {  //setter para o nome
        this.nome = nome;

    }

}
