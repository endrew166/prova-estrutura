package iftm.estrutura.ex3;

import iftm.estrutura.Lista;
import iftm.estrutura.RpgCadastro;

public class main {

	public static void main(String[] args) {
		ListaLigada<RpgCadastro> listaLigada = new ListaLigada<RpgCadastro>();

		RpgCadastro nome1 = new RpgCadastro("Elfo", "Alvorecer");
		RpgCadastro nome2 = new RpgCadastro("Anao", "Touros Negros");
		RpgCadastro nome3 = new RpgCadastro("Humano", "Purpuras");
		RpgCadastro nome4 = new RpgCadastro("Minotauro", "Aguias de Prata");
		RpgCadastro nome5 = new RpgCadastro("Halfling", "Cervo Cianos");

		listaLigada.add(nome1);
		listaLigada.add(nome2);
		listaLigada.add(nome3);
		listaLigada.add(nome4);
		listaLigada.add(nome5);
		
		System.out.println("Personagens adicionados\n" + listaLigada);
		listaLigada.inverter();
		System.out.println("Personagens Invertidos\n" + listaLigada);
	
		ListaLigada<RpgCadastro> listanome = new ListaLigada<RpgCadastro>();
		
		RpgCadastro nome6 = new RpgCadastro("Albion", "Mago");
		RpgCadastro nome7 = new RpgCadastro("Samoth", "Druida");
		RpgCadastro nome8 = new RpgCadastro("Mestrix", "Clerigo");
		RpgCadastro nome9 = new RpgCadastro("Bin", "guerreiro");
		RpgCadastro nome10 = new RpgCadastro("Rapinir", "feiticeiro");
		
		listanome.add(nome6);
		listanome.add(nome7);
		listanome.add(nome9);
		listanome.add(nome9);
		listanome.add(nome10);
		System.out.println("Nome e raças:\n" + listanome.intercalar(listaLigada));
		
		System.out.println("Nome e depois as raças: \n" + listanome.unir(listaLigada));
	
	}

}
