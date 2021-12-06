package controller;

public class Sonda{
	
	
	public Sonda(String posicao) {
		super();
		this.posicao = posicao;
	}
	private String  posicao;
	
	
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public void mover() {}
	
	public void girarDireita()	{}
	public void girarEsquerda()	{}
	
	public boolean  validacaoOperacao( String entrada) {
		return false;
				
	}
}
