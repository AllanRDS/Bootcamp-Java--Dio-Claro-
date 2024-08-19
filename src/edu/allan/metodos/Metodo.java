package edu.allan.metodos;

public class Metodo 
{
  public static void main(String[] args) 
  {
    /* Quando se cria um método deve-se atentar a 3 coisas : (Visibilidade) Retorno Nome e Parâmetros
     * */
    // Se o método não possui retorno então é void
    // Método só deve ter uma proposta
    // Deve-se prestar atenção se o método tem risco de apresentar exceção
    // throws Exception : indica que o método ao ser utilizado
	  // poderá gerar uma exceção
    // Método deve ser um verbo e está em camelCase
  }
  public int somar (int numero1, int numero2)
  {
    return numero1 + numero2;   
  }

  public double dividir (double Divisor, double Dividendo) throws Exception
  {
    //Deve-se atentar que aqui é possível uma exceção
    return Divisor / Dividendo;
  }

  public void gravarCliente(String nome, String cpf, Integer telefone){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
  
}