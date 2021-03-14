
package Exercicio;


public class PortaContentores extends Navio {

    private int maxContentores; // máximo de contentores 

    public PortaContentores(String matricula, String nome, float comprimento, int maxContentores) {
        super(matricula, nome, comprimento);
        this.maxContentores = maxContentores;
    }

    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

    public float getMaxContentores() {
        return maxContentores;
    }

}
