
package Exercicio;

/**
 *
 * @author Asus
 */
public class PortaContentores extends Navio {

    private int maxContentores; // máximo de contentores 

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param maxContentores
     */
    public PortaContentores(String matricula, String nome, float comprimento, int maxContentores) {
        super(matricula, nome, comprimento);
        this.maxContentores = maxContentores;
    }

    /**
     *
     * @param maxContentores
     */
    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

    /**
     *
     * @return
     */
    public float getMaxContentores() {
        return maxContentores;
    }

}
