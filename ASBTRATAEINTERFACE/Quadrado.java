package ASBTRATAEINTERFACE;

import javax.swing.JOptionPane;
public class Quadrado extends Retangulo {

    public Quadrado(int lado2, int lado1, String cor) {
        super(lado2, lado1, cor);
    }

    public  Quadrado() {
          
    }

    @Override
    public void calcularArea() {
        int areaResultado = super.getLado1() * super.getLado1();
        JOptionPane.showMessageDialog(null, "Area do Quadrado: "+areaResultado);

    }

    @Override
    public void calcularPerimetro() {
        int periResultado = super.getLado1() * 4;
        JOptionPane.showMessageDialog(null, "Perimetro do Quadrado: "+periResultado);
    }

    @Override
    public void exibir() {
        JOptionPane.showMessageDialog(null, "Objeto Quadrado\nLado1: "+super.getLado1() +"\nLado2: "+super.getLado1()+"\nCor: "+getCor());
    }
}