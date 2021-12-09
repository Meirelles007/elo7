package view;

import javax.swing.JOptionPane;

import controller.Sonda;

public class Principal {

	public static void main(String[] args) {

		// Para facilitar a linha de raciocionioe partindo da premissa que planalto é
		// retangular irei considerar que o
		// ponto superior-direito da malha do planalto seja(0,100)

       //A primeira indica sua posição inicial e a segunda uma série de instruções indicando para a sonda	
       //como ela deverá explorar o planalto.

		// Pi s1 - (0,100)
		// Pi s1 - (0,100)
		/// ------------------
		// |                  |
		// |                  |
		// |                  |
		// |                  |
		/// ------------------

		Sonda sonda1 = new Sonda("0 100");
		Sonda sonda2 = new Sonda("0 100");

		int sair = 0;
		int qualSonda = 1;
		do {
			if (qualSonda == 1) {
				qualSonda++;
				String coordenada = null;
				do {
					coordenada = "0 2 n";
					// String.parseString(JOptionPane.showInputDialog("Digite tamanho de eixo
				} while (sonda1.validacaoOperacao(coordenada));
				try {
					Character.getNumericValue(coordenada.charAt(0));
					sonda1.setPosicao(coordenada);
					System.out.println("Saida sonda 1:  "+ sonda1.getPosicao());
				} catch (Exception e) {
					for (int i = 0; i < coordenada.length(); i++) {
						char indicador = coordenada.charAt(i);
						if (indicador == 'L') {
							sonda1.girarEsquerda();
							System.out.println("Saida sonda 1:  "+ sonda1.getPosicao());
						}
						if (indicador == 'R') {
							sonda1.girarDireita();
							System.out.println("Saida sonda 1:  "+ sonda1.getPosicao());
						}
						if (indicador == 'M') {
							sonda1.mover();
							System.out.println("Saida sonda 1:  "+ sonda1.getPosicao());
						}
					}
				}

			} else {
				qualSonda--;
				String coordenada = null;
				do {
					coordenada = "0 2 n";
					// String.parseString(JOptionPane.showInputDialog("Digite tamanho de eixo
												// X"));
				} while (sonda2.validacaoOperacao(coordenada));
				// validar entradad
				try {
					Character.getNumericValue(coordenada.charAt(0));
					sonda2.setPosicao(coordenada);
				} catch (Exception e) {
					for (int i = 0; i < coordenada.length(); i++) {
						char indicador = coordenada.charAt(i);
						if (indicador == 'L') {
							sonda2.girarEsquerda();
						}
						if (indicador == 'R') {
							sonda2.girarDireita();
						}
						if (indicador == 'M') {
							sonda2.mover();
						}
					}
				}
			}
			sair = Integer.parseInt(JOptionPane.showInputDialog("Deseja parar a exploração, caso de digite 1"));
		} while (sair == 1);

	}
}
