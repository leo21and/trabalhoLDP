
package Exercicio;

public class Main {

    public static void main(String[] args) {
        Porto porto = new Porto(10);
        Petroleiro petroleiro = new Petroleiro("AA-55-ZT", "Navio1", 300, 10);
        PortaContentores portaContentores1 = new PortaContentores("AA-35-SS", "Navio2", 400, 20);
        PortaContentores portaContentores2 = new PortaContentores("QW-78-YU", "Navio3", 500, 30);
        porto.adicionaNavio(petroleiro);
        porto.adicionaNavio(portaContentores1);
        porto.adicionaNavio(portaContentores2);

        System.out.println("A capacidade total de carga dos navios no porto é de: " + porto.capacidadeTotal());


    }

}
