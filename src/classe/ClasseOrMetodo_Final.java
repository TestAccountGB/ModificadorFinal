package classe;

///////////////////////////////////////////////////////////

//Classes Final

@SuppressWarnings("unused")
public final class ClasseOrMetodo_Final {//Todo classe com final n�o pode ser estendidas e tamb�m n�o pode ser
	//Abstrata por motivos obvios. Por boa pratica, deve-se usar o final em toda classe que voce nao pretende estender.
	
///////////////////////////////////////////////////////////

//Atributos ou "Variaveis" (Constante) Final
	
	private String nome;
	private int idade;
	private final int TAMANHOMEDIOPAU; //= 3; //Atributos ou "Variaveis" (Constante) Final s�o constantes e devem ser inicializadas,
	//Ou em sua declara��o ou em seu construtor
	
	ClasseOrMetodo_Final(int pau){
		this.TAMANHOMEDIOPAU = pau;
	}
	
///////////////////////////////////////////////////////////
	
	//Metodos Final
	
	//Eles simplismente n�o podem ser sobrescritos
	
	public final void mostrarAlgo(String algo) {
		System.out.println(algo);
	}
}