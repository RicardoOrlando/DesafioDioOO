package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> caonteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> caonteudoConcluido = new LinkedHashSet<>();
	
	
	
	
	//metodos de emplementação
	public void inscreverBootcamp(BootCamp bootcamp) {
		
		this.caonteudoInscrito.addAll(bootcamp.getConteudo());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional <Conteudo> conteudo = this.caonteudoInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.caonteudoConcluido.add(conteudo.get());
			this.caonteudoInscrito.remove(conteudo.get());
			
		}else {
			System.err.println("Voce nao esta inscrito em nenhum conteudo");
		}
	}
	
	public double cauculaTotalXp() {
		
		return this.caonteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calculaXp()).sum();
	}

	public String getNome() {
		return nome;
	}

	//metodos essenciais
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getCaonteudoInscrito() {
		return caonteudoInscrito;
	}

	public void setCaonteudoInscrito(Set<Conteudo> caonteudoInscrito) {
		this.caonteudoInscrito = caonteudoInscrito;
	}

	public Set<Conteudo> getCaonteudoConcluido() {
		return caonteudoConcluido;
	}

	public void setCaonteudoConcluido(Set<Conteudo> caonteudoConcluido) {
		this.caonteudoConcluido = caonteudoConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caonteudoConcluido, caonteudoInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(caonteudoConcluido, other.caonteudoConcluido)
				&& Objects.equals(caonteudoInscrito, other.caonteudoInscrito) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}
