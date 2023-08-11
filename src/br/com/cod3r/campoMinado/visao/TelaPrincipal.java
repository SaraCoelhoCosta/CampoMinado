package br.com.cod3r.campoMinado.visao;

import javax.swing.JFrame;

import br.com.cod3r.campoMinado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
//Como TelaPrincipal herda de JFrame, ele pode chamar os metodos que estao no JFrame como se fosse dele.

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 5);
		add(new PainelTabuleiro(tabuleiro)); // Adiciona painel na tela.

		setTitle("Campo Minado"); // Define titulo da tela.
		setSize(690, 438); // Define tamanho da tela.
		setLocationRelativeTo(null); // Centraliza tela.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Ativa funcao do botao de fenchar tela.
		setVisible(true); // Define se tela esta visivel ou nao.
	}

}
