package iftm.estrutura;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;

	}

	public boolean adiciona(T elemento) {

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		return true;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public T busca(int posicao) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Posicao Invalida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}

		}
		return -1;
	}

	public void remover(int posicao) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Posicao Invalida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;

	}

	public void removerT(String elemento) {
		for (int i = 0; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;

	}

	public boolean contem(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}

		}
		return false;
	}

	public int indicio(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}

		}
		return -1;
	}

	public void inverte() {
		T[] novos = (T[]) new Object[this.tamanho];
		for (int i = 0; i < this.tamanho; i++) {
			novos[this.tamanho - 1 - i] = elementos[i];
		}
		this.elementos = novos;
	}

	public Lista<T> intercalarListas(Lista<T> outro) {

		Lista<T> novo = new Lista<T>(this.tamanho + this.tamanho);

		int conta = 0;
		int conta2 = 0;
		for (int i = 0; i < (this.tamanho + this.tamanho); i++) {

			if (this.tamanho > conta) {
				novo.adiciona(this.elementos[i]);
				conta++;
			}
			if (this.tamanho > conta2) {
				novo.adiciona(outro.elementos[i]);
				conta2++;
			}
		}
		return novo;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(elementos);
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		if (!Arrays.deepEquals(elementos, other.elementos))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

}