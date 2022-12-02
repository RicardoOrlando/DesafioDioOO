package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	
		Curso cur = new Curso();
		
		cur.setTitulo("Curso java");
		cur.setDescricao("Descrição curso java");
		cur.setCargaHoraria(8);
	
	
		Curso cur1 = new Curso();
		
		cur1.setTitulo("Curso java Script");
		cur1.setDescricao("Descrição curso java Script");
		cur1.setCargaHoraria(8);
	
	
		Mentoria ment =new Mentoria();
		
		ment.setTitulo("mentoria de java");
		ment.setDescricao("descrição mentoria java");
		ment.setData(LocalDate.now());
		
		Mentoria ment1 =new Mentoria();
		
		ment1.setTitulo("mentoria de java Script");
		ment1.setDescricao("descrição mentoria java Script");
		ment1.setData(LocalDate.now());
		
	
	/*
		System.out.println(cur1);
		System.out.println("");
		System.out.println("");

		System.out.println(cur);
		System.out.println("");
		System.out.println("");
		
		System.out.println(ment1);
		System.out.println("");
		System.out.println("");
		
		System.out.println(ment);
	*/
		
		BootCamp boot = new BootCamp();
		
		boot.setNome("BootcamcJava Developer");
		boot.setDescricao("Descricao Bootcamp Java Developer");
		boot.getConteudo().add(cur);
		boot.getConteudo().add(cur1);
		boot.getConteudo().add(ment);
		
		Dev ricardo = new Dev();
		ricardo.setNome("Ricardo");
		ricardo.inscreverBootcamp(boot);
		System.out.println("Conteudos Inscritos Ricardo"+ ricardo.getCaonteudoInscrito());
		ricardo.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Ricardo"+ ricardo.getCaonteudoInscrito());
		System.out.println("--");
		System.out.println("Conteudos Concluidos Ricardo"+ ricardo.getCaonteudoConcluido());
		System.out.println("XP"+ricardo.cauculaTotalXp());
		System.out.println("--");
		
		
		Dev patricia = new Dev();
		patricia.setNome("Patricia");
		patricia.inscreverBootcamp(boot);
		System.out.println("Conteudos Inscritos Patricia"+ patricia.getCaonteudoInscrito());
		patricia.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Patricia"+ patricia.getCaonteudoInscrito());
		System.out.println("--");
		System.out.println("Conteudos Concluidos Patricia"+ patricia.getCaonteudoConcluido());
		System.out.println("XP"+ patricia.cauculaTotalXp());
		System.out.println("--");
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
