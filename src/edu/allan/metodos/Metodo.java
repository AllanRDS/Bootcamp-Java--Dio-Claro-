package edu.allan.metodos;

/**
 * Esta é uma classe para ensinar sobre métodos
 * @author Allan Reymond
 * @version 1.0
 */
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
    // Deve-se criar métodos fora do método main (Não se pode criar método dentro um método)
      
  }
  /**
   * Este método é usado para somar dois números
   * @param numero1 primeiro parametro para a soma
   * @param numero2 segundo parâmetro para a soma
   * @return retorna um número inteiro após somar dois números
   */
  public int somar (int numero1, int numero2)
  {
    return numero1 + numero2;   
  }
    /**
     * Esté é o método que nos permitidi dividir um número
     * @param Divisor este é o número que vai ser dividido
     * @param Dividendo esté é número que vai dividir o dividendo
     * @return retorna um valor double que é o resultado da divisão do divisor e dividendo
     */
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