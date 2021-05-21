package iftm.estrutura;

import java.util.Comparator;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Lista<RpgCadastro> lista = new Lista<RpgCadastro>(10);
		// nomes e classe
		RpgCadastro nome1 = new RpgCadastro("Albion", "Mago");
		RpgCadastro nome2 = new RpgCadastro("Samoth", "Druida");
		RpgCadastro nome3 = new RpgCadastro("Mestrix", "Clerigo");
		RpgCadastro nome4 = new RpgCadastro("Bin", "guerreiro");
		RpgCadastro nome5 = new RpgCadastro("Rapinir", "feiticeiro");
		// raca e guilda
		RpgCadastro nome6 = new RpgCadastro("Elfo", "Alvorecer");
		RpgCadastro nome7 = new RpgCadastro("Anao", "Touros Negros");
		RpgCadastro nome8 = new RpgCadastro("Humano", "Purpuras");
		RpgCadastro nome9 = new RpgCadastro("Minotauro", "Aguias de Prata");
		RpgCadastro nome10 = new RpgCadastro("Halfling", "Cervo Cianos");

		lista.adiciona(nome1);
		lista.adiciona(nome2);
		lista.adiciona(nome3);
		lista.adiciona(nome4);
		lista.adiciona(nome5);

		System.out.println("Lista Dos Jogadores de RPG \n" + lista);
		lista.inverte();
		System.out.println("Lista Dos Jogadores de RPG Invetida \n" + lista);

		Lista<RpgCadastro> listaRaca = new Lista<RpgCadastro>(10);
		listaRaca.adiciona(nome6);
		listaRaca.adiciona(nome7);
		listaRaca.adiciona(nome8);
		listaRaca.adiciona(nome9);
		listaRaca.adiciona(nome10);

		System.out.println("Lista De Raças de RPG  e Guilda\n" + listaRaca);
		System.out.println("Nome e raca juntos:");
		System.out.println(lista.intercalarListas(listaRaca));
	}

}
