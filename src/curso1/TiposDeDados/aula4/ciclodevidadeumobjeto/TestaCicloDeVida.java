package curso1.TiposDeDados.aula4.ciclodevidadeumobjeto;

import curso1.TiposDeDados.aula3.camposdeobjetos.Carro;

public class TestaCicloDeVida {

	public static void main(String... args) {
		Carro c = new Carro();
		c.ano = 2014;		
		Carro c1 = c;
		System.out.println("Ano do carro c1: " + c1.ano);
		
		c.ano = 2016;
		Carro c2 = c;
		System.out.println("Ano do carro c2: " + c2.ano);
		
		c = null;
		Carro c3 = c2;
		c3.ano = 2019;
		System.out.println("Ano do carro c3: " + c3.ano);
		
		Carro[] cs = new Carro[10];
		System.out.println("Quantidades no array de carros: " + cs.length);
		cs[1] = new Carro();
		cs[2] = new Carro();
		cs[1].modelo = "Modelo do carro na posição 1: Porsche.";
		cs[2].modelo = "Modelo do carro na posição 2: Mustang.";
		System.out.println(cs[1].modelo);
		System.out.println(cs[2].modelo);
		
	}
}
