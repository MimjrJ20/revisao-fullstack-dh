package Revisao;//main

import java.util.Scanner;

public class Revisao01TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner para imprimir
		Scanner leia= new Scanner (System.in);
		
		//instanciar as subclasses
		Revisao01Cachorro cachorro = new Revisao01Cachorro();
		Revisao01Cavalo cavalo = new Revisao01Cavalo();
		Revisao01Preguica preguica = new Revisao01Preguica();
		
		//criando vari�veis
		Revisao01Animal animal = null;
		int x=0;
		
		//do/while
		do
		{
			System.out.println("\nQual o tipo de seu animal?\n"
							+ "\n1-CACHORRO"
							+ "\n2-CAVALO"
							+ "\n3-PREGUI�A");
			x = leia.nextInt();
			
			if(x==1)
			{
				leia.nextLine();//limpeza de cache
				
				animal = cachorro;
				
				System.out.println("\nQual o nome do seu cachorro: ");
				String nome = leia.nextLine();
				
				
				System.out.println("\nQual o idade do seu cachorro: ");
				int idade = leia.nextInt();
				
				leia.nextLine();//limpeza de cache
				
				System.out.println("\nQual o som do seu cachorro: ");
				String som = leia.nextLine();
				
				System.out.println("\n---------------------------------------------");
				
				//m�todos da subclasse
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
			}
			else if(x==2)
			{
				leia.nextLine();//limpeza de cache
				
				animal = cavalo;
				
				System.out.println("\nQual o nome do seu cavalo: ");
				String nome = leia.nextLine();
				
				System.out.println("\nQual o idade do seu cavalo: ");
				int idade = leia.nextInt();
				
				leia.nextLine();//limpeza de cache
				
				System.out.println("\nQual o som do seu cavalo: ");
				String som = leia.nextLine();
				
				System.out.println("\n---------------------------------------------");
				
				//m�todos da subclasse
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
			}
			else if (x==3)
			{
				leia.nextLine();//limpeza de cache
				
				animal = preguica;
				
				System.out.println("\nQual o nome do seu pregui�a: ");
				String nome = leia.nextLine();
				
				System.out.println("\nQual o idade do seu pregui�a: ");
				int idade = leia.nextInt();
				
				leia.nextLine();//limpeza de cache
				
				System.out.println("\nQual o som do seu pregui�a: ");
				String som = leia.nextLine();
				
				System.out.println("\n---------------------------------------------");
				
				//m�todos da subclasse
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.SubirArvores();
			}
			else
			{
				System.out.println("\nInforma��o errada!!");
			}
		}
		while(x<=0 || x>4);
	}

}
