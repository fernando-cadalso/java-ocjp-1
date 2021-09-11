package curso3.camposdeobjetos;

public class Carro {
public String modelo;
public int ano;

public Carro(){
	ano = 2014;
}

void reset() {
	ano = 2014;
}

public String getDadosImpressao() {
	return modelo + "::" + ano;
}
public void setModelo(String modelo) {
	/*
	 * A palavra-chave this faz distinção entre a
	 * variável da classe e a variável local.
	 */
	this.modelo = modelo;
}

}
