
package Exercicio;

/**
 *
 * @author Asus
 */
public class Petroleiro extends Navio {

    private float capacidadeCarga;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidadeCarga
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidadeCarga) {
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     *
     * @param capacidadeCarga
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     *
     * @return
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

}
