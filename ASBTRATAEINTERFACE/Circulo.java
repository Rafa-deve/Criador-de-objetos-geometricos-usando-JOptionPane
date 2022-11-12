package ASBTRATAEINTERFACE;

import javax.swing.JOptionPane;

public class Circulo extends ObjetoGeometrico {
    protected float raio;

    public Circulo (float raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
        super();
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o raio do circulo?: ")); 
    }
    
    public void exibir() {
        JOptionPane.showMessageDialog(null, "Objeto Circulo\nRaio: "+raio+"\nCor: "+getCor());
    }

    @Override
    public void calcularArea(){
        float area = raio*raio*3.14f;
        JOptionPane.showMessageDialog(null, "Area do Circulo: "+area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = raio*raio*3.14f;
        JOptionPane.showMessageDialog(null, "Perimetro do Circulo: "+perimetro);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }  
}