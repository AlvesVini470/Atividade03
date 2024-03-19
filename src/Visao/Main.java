package Visao;
import javax.swing.JOptionPane;

import Modelagem.Estudante;
import Negocio.FilaDeEstudantes;


	public class Main {
	    public static void main(String[] args) {
	        FilaDeEstudantes fila = new FilaDeEstudantes(5);

	        while (true) {
	            String nome = JOptionPane.showInputDialog("Digite o nome do estudante (ou 'sair' para encerrar):");
	            if (nome.equalsIgnoreCase("sair")) {
	                break;
	            }
	            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do estudante:"));
	            Estudante estudante = new Estudante(nome, idade);
	            fila.enqueue(estudante);
	        }

	        JOptionPane.showMessageDialog(null, "Fila de estudantes:");

	        while (!fila.isEmpty()) {
	            Estudante estudante = fila.dequeue();
	            JOptionPane.showMessageDialog(null, "Nome: " + estudante.getNome() + ", Idade: " + estudante.getIdade());
	        }
	    }
}