package pt.ulusofona.lp2.jungleGame;

public class Simulador {

	public static void main(String[] args) {
		System.out.println("Inicio Simula��o");
		//criacao objecto sem inicializa��o
		Animal tarzan = new Animal();
		tarzan.setNome("Tarzan");
		tarzan.setId(0);
		tarzan.setIdEspecie(3);
		tarzan.setVelocidade(1);
		tarzan.setEnergia(3);
		
		//cria��o de objectos com constructo inicializa�ao
		Animal simba = new Animal("Simba",1,4,2,2);
		
		String linhaFicheiro = "Sabichao:2:6:1:1";
		Animal sabichao = Animal.criarAnimal(linhaFicheiro);
			
		//visualiza��o
		System.out.println(tarzan);
		System.out.println(simba);
		System.out.println(sabichao);
		
		// Visualiza��o extendida
		tarzan.mostraAnimal();
		simba.mostraAnimal();
		sabichao.mostraAnimal();

	}

}
