
package Exercicio;

/**
 *
 * @author Asus
 */
public class Petroleiro extends Navio {     //classe filha de Navio

    private float capacidadeCarga;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidadeCarga
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidadeCarga) {    //construtor
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     *
     * @param capacidadeCarga
     */
    public void setCapacidadeCarga(float capacidadeCarga) { //setter para capacidade de carga
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     *
     * @return
     */
    public float getCapacidadeCarga() { //getter para capacidade de carga
        return capacidadeCarga;
    }

}
