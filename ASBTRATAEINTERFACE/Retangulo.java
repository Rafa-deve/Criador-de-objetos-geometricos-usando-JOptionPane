package ASBTRATAEINTERFACE;

import javax.swing.JOptionPane;

public class Retangulo extends ObjetoGeometrico{
    protected int lado2;
    protected int lado1;
   
    public Retangulo(int lado2, int lado1, String cor) {
        super(cor);
        this.lado2 = lado2;
        this.lado1 = lado1;
    }

    public  Retangulo() {
        super();
        lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do primeiro lado?: "));
        lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do segundo lado?: "));
    }

    public void exibir() {
        JOptionPane.showMessageDialog(null, "Objeto Retangulo\nLado1: "+lado1 +"\nLado2: "+lado2+"\nCor: "+getCor());
    }

    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "Area do Retangulo: "+(lado1*lado2));
    }

    public void calcularPerimetro() {
        JOptionPane.showMessageDialog(null, "Perimetro do Retangulo: "+(lado2+lado2+lado1+lado1));
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    } 
}