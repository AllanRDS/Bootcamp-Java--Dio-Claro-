package edu.allan.operadores;
public class OperadoresLogicos {

  public static void main(String[] args) 
  {
    int a = 2;
    int b = 3;

    if (a > 20 && b < 20) 
    {
      System.out.println("A condição é verdadeira");
    }
    else 
    {
      System.out.println("A condição é falsa");
    }
    
    if (a > 1 || a < 2) 
    {
      System.out.println("A condição é verdadeira");
    }
    else 
    {
      System.out.println("A condição é falsa");
    }
    
    if (a > 1 || (7 > 4)) 
    {
      System.out.println("A condição é verdadeira");
    }
    
  }
}