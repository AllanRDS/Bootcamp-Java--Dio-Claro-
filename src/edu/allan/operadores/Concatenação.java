package edu.allan.operadores;

public class Concatenação {
  public static void main(String[] args) {
    //Depois que ele percebe que é texto começa a concatenar
    String concatenacao ="?";

    System.out.println(concatenacao);
    
    concatenacao = 1+1+1+"1";
    
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+1;
    
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+"1";
    
    System.out.println(concatenacao);
    concatenacao = "1"+1+1+1;
    
    System.out.println(concatenacao);
    concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);
  }
}
