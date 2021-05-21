package iftm.estrutura.ex2;

import iftm.estrutura.Lista;
import iftm.estrutura.RpgCadastro;

public class main {

	public static void main(String[] args) {
		ListaPilha<RpgCadastro> listaP = new ListaPilha<RpgCadastro>();
		// nomes e classe
		RpgCadastro nome1 = new RpgCadastro("Albion", "Mago");
		RpgCadastro nome2 = new RpgCadastro("Samoth", "Druida");
		RpgCadastro nome3 = new RpgCadastro("Mestrix", "Clerigo");
		RpgCadastro nome4 = new RpgCadastro("Bin", "guerreiro");
		RpgCadastro nome5 = new RpgCadastro("Rapinir", "feiticeiro");

		listaP.adicionar(nome1);
		listaP.adicionar(nome2);
		listaP.adicionar(nome3);
		listaP.adicionar(nome4);
		listaP.adicionar(nome5);
	
		System.out.println("Lista de personagens:\n" + listaP);
		listaP.remover(nome1);
		System.out.println("Removendo um Personagem da lista:\n" + listaP);
	
	}

}
