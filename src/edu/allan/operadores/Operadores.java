package edu.allan.operadores;

public class Operadores {
  public static void main(String[] args) {
    // Operadores de Atribuição
    // = igualdade
    String nome = "AllanRDS";
    int idade = 21;
    double salarioTotal = 2500;
    boolean verdadeiroFalso = true;

    // Operadores Aritméticos
    int soma = 1 + 1;
    int subtração = 1 - 1;
    int divisão = 1 / 1;
    int multiplicação = 1 * 1;
    int restoDaDivisão = 1 % 1;
    //Obs Exponenciação só a partir de biblioteca
    //Obs + quando utilizado em String realiza concatenação

    //Operadores Unários
    int numeroPositivo = +5; //Por padrão qualquer número declarado já é positivo
    int numeroNegativo = -5;
    int numero = 10;
    numero++; // Incremento | Se colocar ++ antes o incremento é realizado antes e dps e na próxima linha
    numero--; // Decremento | Se colocar -- antes o decremento é realizado antes e dps e na próxima linha
    verdadeiroFalso = !verdadeiroFalso; // Inverte o valor
    
    numero += 1; // Mesma coisa que número = numero + 1
    numero -= 2; // Mesma coisa que número = numero - 2 
    numero /= numero; // Mesma coisa que número = numero / numero
    numero *= 5; // Mesma coisa que número = numero * 5


  }
}