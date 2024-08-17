package edu.allan.operadores;

public class StringComparação {
    public static void main(String[] args) {
        String nome = "Allan";
        String nome2 = "Allan";

        Boolean verdadeiroFalso = nome == nome2;
        System.out.println(verdadeiroFalso);
        
        String nome3 = "Allan";
        String nome4 = new String("Allan");
    
        Boolean verdadeiroFalso2 = nome3 == nome4;
        System.out.println(verdadeiroFalso2);

        //Não se deve comparar textos com ==, pois se o tipo for diferente dará errado
        //Para comparar contéudos de texto se usa .equals

        System.out.println(nome3.equals(nome4));
    }
}
