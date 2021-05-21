package iftm.estrutura;

//package io.github.jiangdequan;

public class RpgCadastro {

  private String nome;
  private String classe;


  public RpgCadastro() {}

  public RpgCadastro(String nome, String classe) {
      this.nome = nome;
      this.classe = classe;
    
  }


  public String getNome() {
      return nome;
  }

  
  public void setNome(String nome) {
      this.nome = nome;
  }


  public String getClasse() {
      return classe;
  }


  public void setClassee(String classe) {
      this.classe = classe;
  }




  @Override
  public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nome == null) ? 0 : nome.hashCode());
      result = prime * result + ((classe == null) ? 0 : classe.hashCode());
      return result;
  }


  @Override
  public String toString() {
      return "Personagem [ nome ou Raça = " + nome + ", classe ou guilda = " + classe + "]";
  }

  

}