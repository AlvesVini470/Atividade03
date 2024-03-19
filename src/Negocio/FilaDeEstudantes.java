package Negocio;

import javax.swing.JOptionPane;

import Modelagem.Estudante;

public class FilaDeEstudantes{
	
	    private Estudante[] fila;
	    private int tamanhoMaximo;
	    private int inicio;
	    private int fim;
	    private int totalElementos;

	    public FilaDeEstudantes(int tamanhoMaximo) {
	        this.tamanhoMaximo = tamanhoMaximo;
	        fila = new Estudante[tamanhoMaximo];
	        inicio = 0;
	        fim = -1;
	        totalElementos = 0;
	    }

	    public void enqueue(Estudante estudante) {
	        if (totalElementos == tamanhoMaximo) {
	            JOptionPane.showMessageDialog(null, "Fila cheia!");
	            return;
	        }
	        if (fim == tamanhoMaximo - 1) {
	            fim = -1;
	        }
	        fila[++fim] = estudante;
	        totalElementos++;
	    }

	    public Estudante dequeue() {
	        if (totalElementos == 0) {
	            JOptionPane.showMessageDialog(null, "Fila vazia!");
	            return null;
	        }
	        Estudante temp = fila[inicio++];
	        if (inicio == tamanhoMaximo) {
	            inicio = 0;
	        }
	        totalElementos--;
	        return temp;
	    }

	    public Estudante peek() {
	        if (totalElementos == 0) {
	            JOptionPane.showMessageDialog(null, "Fila vazia!");
	            return null;
	        }
	        return fila[inicio];
	    }

	    public boolean isEmpty() {
	        return totalElementos == 0;
	    }

	    public boolean isFull() {
	        return totalElementos == tamanhoMaximo;
	    }

}