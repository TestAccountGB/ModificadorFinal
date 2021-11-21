package classe;

///////////////////////////////////////////////////////////

//Classes Final

@SuppressWarnings("unused")
public final class ClasseOrMetodo_Final {//Todo classe com final não pode ser estendidas e também não pode ser
	//Abstrata por motivos obvios. Por boa pratica, deve-se usar o final em toda classe que voce nao pretende estender.
	
///////////////////////////////////////////////////////////

//Atributos ou "Variaveis" (Constante) Final
	
	private String nome;
	private int idade;
	private final int TAMANHOMEDIOPAU; //= 3; //Atributos ou "Variaveis" (Constante) Final são constantes e devem ser inicializadas,
	//Ou em sua declaração ou em seu construtor
	
	ClasseOrMetodo_Final(int pau){
		this.TAMANHOMEDIOPAU = pau;
	}
	
///////////////////////////////////////////////////////////
	
	//Metodos Final
	
	//Eles simplismente não podem ser sobrescritos
	
	public final void mostrarAlgo(String algo) {
		System.out.println(algo);
	}
}