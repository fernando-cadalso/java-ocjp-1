
public class HelloWorld{
	
	public static void main(String[] params) {
		System.out.println("Rodando o software.");
		System.out.println("Tamanho dos parâmetros: " + params.length);
		for (int i = 0; i < params.length; i++) {
			System.out.println("Parâmetro " + i + " => " + params[i]);
		}
	}
}