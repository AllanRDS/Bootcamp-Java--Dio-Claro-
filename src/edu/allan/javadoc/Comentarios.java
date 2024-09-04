package edu.allan.javadoc;

/**
 * Comentarios
 */
public class Comentarios {
    public static void main(String[] args) {
      // Isso é um comentários de uma única linha
      /* Olá,* Eu sou um comentario  
      * que posso ser mais detalhadod
      * quando necessário*/
      //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
      //javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/**/*.java
      
    }
/** 
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */
public void resultado()
{
    System.out.println();
}

}