package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	//construtor vazio
	
	public Mentoria() {
		
	}
	
	//metodos essenciais
	
	
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
		
		
		
	
}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	@Override
	public double calculaXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO  + 10;
	}
	
	
	
	
	
	
	
	
	

	
	
	

}
