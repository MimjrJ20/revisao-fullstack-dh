package Revisao;//subclasse

//criando uma herança com a classe Revisao01Animal
public class Revisao01Cavalo extends Revisao01Animal {
	
	public Revisao01Cavalo()
	{
		super("Animal: Revisao01Cavalo");
	}
	
	//implementando o método da classe abstrata com @Override (sobrescrita), sendo herdado da classe mãe ---> polimorfismo
		@Override
		public void Nome(String nomeAnimal)
		{
			System.out.println("\nNome do cavalo: "+nomeAnimal);
		}
		
		@Override
		public void Idade (int idadeAnimal)
		{
			System.out.println("\nIdade do cavalo: "+idadeAnimal);
		}
		
		@Override
		public void Som(String somAnimal)
		{
			System.out.println("\nSom do cavalo: "+somAnimal);
		}
		
		//pode ser criado um método especifico para classe Cachorro
		public void Corre()
		{
			System.out.println("\nUma das caracteristicas do cavalo é correr!");
		}

}
