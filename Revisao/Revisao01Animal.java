package Revisao;//superclasse

//classes abstratas não pode ser instanciadas e não vai ser implementada (bem como a Interface)
public abstract class Revisao01Animal {
	
	//criando atributos
	private String tipoAnimal;
	
	//criando o construtor
	public Revisao01Animal (String tipoAnimal)
	{
		this.tipoAnimal = tipoAnimal;
	}
	
	//criando métodos abstratos para implementar em todas as subclasse
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	//getter e setter do tipoAnimal
	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	

	
	
	

	

}
