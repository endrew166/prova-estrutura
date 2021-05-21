package iftm.estrutura.ex2;

import java.util.ArrayList;

public class ListaPilha<T> extends ArrayList<T> {

	public boolean adicionar(T elemento) {
		this.add(0, elemento);
		return true;
	}

	public boolean remover(T elemento) {
		return this.remove(elemento);
	}
}
