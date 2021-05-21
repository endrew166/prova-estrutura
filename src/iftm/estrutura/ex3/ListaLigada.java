package iftm.estrutura.ex3;

import java.util.LinkedList;

public class ListaLigada<T> extends LinkedList<T> {

	public void inverter() {
		LinkedList<T> listaNova = new LinkedList<>();
		listaNova.addAll(this);
		this.clear();
		while (listaNova.size() > 0) {
			this.add(listaNova.removeLast());
		}
	}

	public ListaLigada<T> intercalar(ListaLigada<T> other) {

		ListaLigada<T> novo = new ListaLigada<T>();
		int conta = 0;
		int conta2 = 0;
		for (int i = 0; i < (this.size() + this.size()); i++) {
			if (this.size() > conta) {
				novo.add(this.get(conta++));

			}
			if (this.size() > conta2) {
				novo.add(other.get(conta2++));
			}
		}
		return novo;
	}

	public ListaLigada<T> unir(ListaLigada<T> other) {

		ListaLigada<T> novo = new ListaLigada<T>();
		int conta = 0;
		int conta2 = 0;
		for (int i = 0; i < (this.size() + this.size()); i++) {
			if (this.size() > conta) {
				novo.add(this.get(conta++));

			} else {
				novo.add(other.get(conta2++));
			}
		}
		return novo;
	}
}
