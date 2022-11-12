package ASBTRATAEINTERFACE;

import javax.swing.JOptionPane;

public abstract class ObjetoGeometrico {
    protected String cor;

    ObjetoGeometrico(String cor) {
        this.cor = cor;
    }

    public  ObjetoGeometrico() {
        cor = JOptionPane.showInputDialog(null, "Qual a cor do objeto?: ");   
    }
    
    public void exibirCor(){
        JOptionPane.showMessageDialog(null, "Objeto geometrico na cor: "+cor);
    }
    
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public void exibir() {
    }
}