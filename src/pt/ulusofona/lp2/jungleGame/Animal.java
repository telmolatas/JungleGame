package pt.ulusofona.lp2.jungleGame;

public class Animal {
	private String nome; //Nome do Animal
	private int id; //ID do animal que identifica o personagem
	private int idEspecie; // id da especie (0..9)
	private int velocidade; // velocidade base do animal (1..5)
	private int energia; //energia inicial (0..5)
	private String[] especies = {"Águia", "Girafa", "Gorila", "Humano", "Leão", "Lebre", "Mocho", "Tartaruga", "Tigre", "Zebra"}; 
	//constantrutor
	public Animal ( ) {}
	public Animal (String nome, int id, int idEspecie, int velocidade, int energia) {
		this.nome = nome;
		this.id = id;
		this.idEspecie = idEspecie;
		this.velocidade = velocidade;
		this.energia = energia;
	}
	// Metodo criar animal a partir string
	//Formato: Tarzan:0:3:1:3
	public static Animal criarAnimal(String animalStr) {
		
		String[] propriedadesAnimal = animalStr.split(":");
		String nome = propriedadesAnimal[0];
		int id = Integer.parseInt(propriedadesAnimal[1]);
		int idEspecie = Integer.parseInt(propriedadesAnimal[2]);
		int velocidade = Integer.parseInt(propriedadesAnimal[3]);
		int energia = Integer.parseInt(propriedadesAnimal[4]);
		Animal animal = new Animal(nome, id, idEspecie, velocidade, energia);
		return animal;
	}
	// Metodo conversao string
	public String toString() {
		String animal ="";
		animal = nome+":"+id+":"+idEspecie+":"+velocidade+":"+energia;
		return animal;
	}
	
	public void mostraAnimal() {
		System.out.println("==== Animal " + id + " ====");
		System.out.println("      nome: "+nome);
		System.out.println("        id: "+id);
		System.out.println("   Espécie: "+especies[idEspecie]);
		System.out.println("Velocidade: "+velocidade);
		System.out.println("   Energia: "+energia);
		System.out.println("-----------------");
	}
	
	//Metodo getter setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}
	
