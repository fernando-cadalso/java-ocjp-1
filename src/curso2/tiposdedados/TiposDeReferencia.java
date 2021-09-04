package curso2.tiposdedados;


public class TiposDeReferencia {

	public static void main(String[] args) {
		/*
		 * Atribui uma nova referência para o objeto MeuObjeto.
		 * Uma referência é um ponteiro para um endereço de memória.
		 */
		MeuObjeto o1 = new MeuObjeto();
		o1.valor=10;
		/*
		 * Cria uma nova referência para o mesmo endereço de memória
		 * alocado para o objeto o1.
		 */
		MeuObjeto o2 = o1;
		
		o1.valor = o1.valor + 5;
		
		System.out.println(o1.valor);
		System.out.println(o2.valor);
				
		
		int a = 10;
		int b = a;
		
		a = a + 5;
		System.out.println(a);
		System.out.println(b);
		
	}
}
