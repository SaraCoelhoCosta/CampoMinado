import javax.swing.JOptionPane;

import br.com.cod3r.campoMinado.visao.TelaPrincipal;

public class Main {
    	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Utilize o botao esquerdo do mouse para abrir um campo e o botao direito para sinalizar as minas!"
				+ "\nO objetivo do jogo sinalizar todas as minas e abrir todos os campos.");
		new TelaPrincipal();
	}
}
