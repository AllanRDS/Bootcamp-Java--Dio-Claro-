package edu.allan.tipodados;

public class TipoDados 
{
	public static void main(String[] args) 
	{
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

		String meuNome = "Allan Reymond";
		String sobrenome = "Da Silva";

		String nomeFinal = meuNome.concat(" ").concat(sobrenome);

		String nomeCompleto = "Pedro" + "Reymond";

		System.out.println(nomeFinal);
		System.out.println(nomeCompleto);
	}
}