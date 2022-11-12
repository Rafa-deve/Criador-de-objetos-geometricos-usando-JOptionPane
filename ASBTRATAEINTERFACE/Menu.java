package ASBTRATAEINTERFACE;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    ArrayList <ObjetoGeometrico> objetos = new ArrayList<>();
    private int escolha;
        
    public Menu() {    
        menu();
    } 

    // MENU
    public void menu(){ 
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inserir objeto\n2 - Exibir os dados de todos os objetos\n3 - Calcular area de todos objetos\n4 - Exibir area dos circulos\n5 - Sair\nDigite a apção desejada!\nR:"));
            switch (escolha) {
                case 1:
                // OPÇÃO A 
                    this.inserirObjeto();
                    break;

                // OPÇÃO B
                case 2:
                    this.exibirDadosArrayList();
                    break;

                // OPÇÃO C
                case 3:
                    this.calcularAreaTodosObjetos();
                    break;

                // OPÇÃO D
                case 4:
                    this.exibirAreaDosCirculos();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (escolha!=5);
    }
    
    // Inserir objeto erguntar qual objeto deseja criar (Retangulo, Circulo, Quadrado), perguntar os dados e inserir no ArrayList;
    // 1 - Inserir objeto
    private void inserirObjeto() {
        int pesquisaObjeto = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual objeto deseja criar: \n1 - Quadrado\n2 - Retangulo\n3 - Circulo"));
        // Quadrado
        if(pesquisaObjeto==1) {
        
            objetos.add(new Quadrado()); 
            
        }
        
        // Retangulo
        else if(pesquisaObjeto==2) {

            objetos.add(new Retangulo());

        }

        // Circulo
        else if(pesquisaObjeto==3) {

            objetos.add(new Circulo());

        // se a informação não correaponder as opções
        } else {
            JOptionPane.showMessageDialog(null, "Opção incorreta, tente novamente!");
        }
    }

    // Exibir os dados de todos os objetos do ArrayList;
    // 2
    private void exibirDadosArrayList() {
        if (!objetos.isEmpty()) {
            for(int i= 0; i < objetos.size(); i++){
                objetos.get(i).exibir();
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Não há objetos cadastrados no sistema!");
        }
    }

    // Calcular area de todos os objetos
    // 3
    private void calcularAreaTodosObjetos() {
        if(!objetos.isEmpty()) {
            for(int i = 0; i < objetos.size(); i++) {
                objetos.get(i).calcularArea();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há objetos cadastrados no sistema!");
        }
    }

    // Exibir apenas a area dos Circulos.
    // 4
    private void exibirAreaDosCirculos() {
        for(int i = 0; i < objetos.size(); i++) {
            if (objetos.get(i) instanceof Circulo) {
                objetos.get(i).calcularArea();
            } 
        }
    } 
}