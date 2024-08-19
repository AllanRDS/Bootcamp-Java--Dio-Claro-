package edu.allan.metodos;
import java.util.Scanner;

public class SmartTv {
  private String marca;
  private String modelo;
  private String tipoDeTela;
  private String resoluçãoTv;
  private int frequencia;

  public boolean estadoTv = false;
  public int canal = 1;
  public int volume = 1;
  
  public SmartTv (String marca, String modelo, String tipoDeTela, String resoluçãoTv, int frequencia)
  {
    this.marca = marca;
    this.modelo = modelo;
    this.tipoDeTela = tipoDeTela;
    this.resoluçãoTv = resoluçãoTv;
    this.frequencia = frequencia;
  }

  Scanner input = new Scanner(System.in);

  void ligarTv ()
  {
    estadoTv = true;
    System.out.println("A tv foi ligada");
  }

  void desligarTv ()
  {
    estadoTv = false;
    System.out.println("A tv foi desligada");
  }

  void aumentarVolume ()
  {
    volume += 1;
    System.out.println("Você aumentou o volume da tv para : " + volume);
  }

  void diminuirVolume ()
  {
    volume -= 1;
    System.out.println("Você diminuiu o volume da tv para : " + volume);
  }

  void trocarCanal (int canal)
  {
    this.canal = canal;
    System.out.println("O canal foi trocado para : " + canal);
  }

  
}
