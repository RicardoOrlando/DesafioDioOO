package br.com.desafio.dominio;

public class Curso extends Conteudo {
	
	
	private int cargaHoraria;
	
	
	//construtor vazio
	
	public Curso() {
		
	}
	
	
	
	//metodos essenciais
	
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}



	@Override
	public double calculaXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}



	
	
	
	
	
	
	
}
