package Revisao;//subclasse

//criando uma heran�a com a classe Revisao01Animal
public class Revisao01Preguica extends Revisao01Animal{
	
	public Revisao01Preguica()
	{
		super("Animal: Revisao01Cachorro");
	}
	
	//implementando o m�todo da classe abstrata com @Override (sobrescrita), sendo herdado da classe m�e ---> polimorfismo
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	
	@Override
	public void Idade (int idadeAnimal)
	{
		System.out.println("\nIdade do cachorro: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom do cachorro: "+somAnimal);
	}
	
	//pode ser criado um m�todo especifico para classe Cachorro
	public void SubirArvores()
	{
		System.out.println("\nUma das caracteristicas da pregui�a � subir em arvores!");
	}

}
